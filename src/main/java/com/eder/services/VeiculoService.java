package com.eder.services;

import com.eder.dtos.DtosVeiculo;
import com.eder.exception.TratamentoErros;
import com.eder.mappers.MapperVeiculo;
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
    private final MapperVeiculo mapperVeiculo;


    @Override
    public Veiculo criar(Veiculo veiculo) {
//        Veiculo veiculo1 = new Veiculo();
//        veiculo1.setPlacaCarro(veiculo.getPlacaCarro());
//        veiculo1.setModelo(veiculo.getModelo());
//        veiculo1.setHoraEntrada(veiculo.getHoraEntrada());
//        veiculo1.setHoraSaida(veiculo.getHoraSaida());
//        veiculo1.setPagamento(veiculo.getPagamento());

       // Veiculo veiculoCriado =
               return repositoryVeiculo.save(veiculo);

       // return veiculoCriado;
    }

    @Override
    public DtosVeiculo criar(DtosVeiculo dtosVeiculo) {
        DtosVeiculo dtosVeiculo1 = new DtosVeiculo();
        return dtosVeiculo1;
    }

    @Override
    public Veiculo atualizar(DtosVeiculo dtosVeiculo,Long id){
        Veiculo modificar = this.obter(id);
//        modificar.setCpf(veiculo.getCpf());
//        modificar.setModelo(veiculo.getModelo());
//        modificar.setPlacaCarro(veiculo.getPlacaCarro());
//        modificar.setNomeMotorista(veiculo.getNomeMotorista());
//        modificar.setHoraEntrada(veiculo.getHoraEntrada());
//        modificar.setHoraSaida(veiculo.getHoraSaida());
//        modificar.setPagamento(veiculo.getPagamento());
        mapperVeiculo.atualizar(modificar,dtosVeiculo);
        repositoryVeiculo.save(modificar);

        return modificar;
    }

    public void deletar(Long id) {
        repositoryVeiculo.deleteById(id);

    }

    public List<Veiculo> listar() {
        return repositoryVeiculo.findAll();
    }

    public Veiculo obter(Long id) {

        Veiculo veiculo = repositoryVeiculo.findById(id).get();
        if (veiculo == null) {
            throw new RuntimeException(" opção indisponivel");
        }
        return repositoryVeiculo.findById(id)
                .orElseThrow(RuntimeException::new);
    }
}