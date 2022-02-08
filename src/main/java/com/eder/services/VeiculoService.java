package com.eder.services;

import com.eder.exception.TratamentoErros;
import com.eder.modulos.Veiculo;
import com.eder.nterface.InterfaceVeiculo;
import com.eder.repository.RepositoryVeiculo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@RequiredArgsConstructor
public class VeiculoService implements InterfaceVeiculo {

    private final RepositoryVeiculo repositoryVeiculo;
//
//    public Veiculo criar(@NotNull Veiculo veiculo) {
//
////        if (veiculo.getPlacaCarro().length() <= 4) {
////            throw new RuntimeException("Dados da placa nao podem ser menores que 4 caracteres");
////        }
//
//        Veiculo Veiculo = new Veiculo();
//        veiculo.setModelo(veiculo.getModelo());
//        veiculo.setPlacaCarro(veiculo.getPlacaCarro());
//        veiculo.setHoraEntrada(veiculo.getHoraEntrada());
//        veiculo.setHoraSaida(veiculo.getHoraSaida());
//        veiculo.setPagamento(veiculo.getPagamento());
//
//        return repositoryVeiculo.save(veiculo);
//
//    }

//    @Override // metodo criado para funcionar implements
//    public DtosVeiculo criar(DtosVeiculo dtosVeiculo) {
//        return null;
//    }

    @Override
    public Veiculo criar(Veiculo Veiculo) {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlacaCarro(veiculo.getPlacaCarro());
        veiculo.setModelo(veiculo.getModelo());
        veiculo.setHoraEntrada(veiculo.getHoraEntrada());
        veiculo.setHoraSaida(veiculo.getHoraSaida());
        veiculo.setPagamento(veiculo.getPagamento());

        Veiculo veiculoCriado  = repositoryVeiculo.save(veiculo);
        return veiculo;
    }

    @Override
    public Veiculo atualizar(Veiculo veiculo, Long id) {
        Veiculo modificar = this.obter(id);
        modificar.setCpf(veiculo.getCpf());
        modificar.setModelo(veiculo.getModelo());
        modificar.setPlacaCarro(veiculo.getPlacaCarro());
        modificar.setNomeMotorista(veiculo.getNomeMotorista());
        modificar.setHoraEntrada(veiculo.getHoraEntrada());
        modificar.setHoraSaida(veiculo.getHoraSaida());
        modificar.setPagamento(veiculo.getPagamento());

        repositoryVeiculo.save(modificar);
        return modificar;
    }

    public void deletar(Long id) {
        repositoryVeiculo.deleteById(id);

    }

    public Veiculo obter(Long id) {

        Veiculo veiculo = repositoryVeiculo.findById(id).get();
        if (veiculo == null) {
            throw new RuntimeException(" opção indisponivel");
        }
        return repositoryVeiculo.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    public List<Veiculo> listar() {
        List<Veiculo> listarVeiculo = repositoryVeiculo.findAll();

        if (listarVeiculo == null) {
            throw new TratamentoErros(" opção indisponivel");
        }
        return listarVeiculo;
    }
}