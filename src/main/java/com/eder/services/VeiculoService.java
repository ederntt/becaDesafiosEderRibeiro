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
    public DtosVeiculo criar(DtosVeiculo dtosVeiculo) {

        Veiculo veiculoCriado = new Veiculo();
        veiculoCriado.setPlacaCarro(dtosVeiculo.getPlacaCarro());
        if (veiculoCriado.getPlacaCarro().length()<7){
            throw  new TratamentoErros("placa do carro nao pode ter menos de 7 digitos");
        }
        if (veiculoCriado.getPlacaCarro().length()>7){
            throw  new TratamentoErros("placa do carro nao pode ter mais de 7 digitos");
        }
        veiculoCriado.setModelo(dtosVeiculo.getModelo());
        veiculoCriado.setHoraEntrada(dtosVeiculo.getHoraEntrada());
        veiculoCriado.setHoraSaida(dtosVeiculo.getHoraSaida());
        veiculoCriado.setPagamento(dtosVeiculo.getPagamento());

        return repositoryVeiculo.save(mapperVeiculo.veiculoToDtoVeiculo(dtosVeiculo));
   }

    @Override
    public Veiculo atualizar(DtosVeiculo dtosVeiculo,Long id){
        Veiculo modificar = this.obter(id);

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

    public List<Veiculo> listar() {
        List<Veiculo> listarVeiculo = repositoryVeiculo.findAll();

        if (listarVeiculo == null) {
            throw new TratamentoErros("Lista indisponivel");
        }
        return listarVeiculo;
    }
}