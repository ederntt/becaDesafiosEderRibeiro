package com.eder.services;

import com.eder.dtos.DtosVeiculo;
import com.eder.exception.TratamentoErros;
import com.eder.modulos.Veiculo;
import com.eder.nterface.InterfaceVeiculo;
import com.eder.repository.RepositoryVeiculo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.TransactionalException;
import java.util.List;

@Data
@Service
@RequiredArgsConstructor
public class VeiculoService implements InterfaceVeiculo {

    private final RepositoryVeiculo repositoryVeiculo;

    @Override
    public Veiculo criar(Veiculo veiculo) {

        Veiculo veiculoCriado = new Veiculo();
        veiculoCriado.setPlacaCarro(veiculo.getPlacaCarro());
        if (veiculoCriado.getPlacaCarro().length()<=6){
            throw  new TratamentoErros("placa do carro nao pode ter menos de 7 digitos");
        }
        veiculoCriado.setModelo(veiculo.getModelo());
        veiculoCriado.setHoraEntrada(veiculo.getHoraEntrada());
        veiculoCriado.setHoraSaida(veiculo.getHoraSaida());
        veiculoCriado.setPagamento(veiculo.getPagamento());

        Veiculo veiculoCriado1 = repositoryVeiculo.save(veiculo);

        return veiculoCriado1;
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

        try {
          return repositoryVeiculo.findById(id).get();
        } catch (java.util.NoSuchElementException nome) {
            throw new TratamentoErros(nome.getMessage());
        }
    }

    public List<Veiculo> listar() {   // verificar com flavius
        List<Veiculo> listarVeiculo = repositoryVeiculo.findAll();

        if (listarVeiculo == null) {
            throw new TratamentoErros("Lista indisponivel");
        }
        return listarVeiculo;
    }
}