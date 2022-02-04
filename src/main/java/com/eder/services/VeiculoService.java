package com.eder.services;

import com.eder.dtos.responses.VeiculoResponse;
import com.eder.modulos.Veiculo;
import com.eder.dtos.request.VeiculoRequest;
import com.eder.nterface.InterfaceVeiculo;
import com.eder.repository.RepositoryVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VeiculoService implements InterfaceVeiculo {

    @Autowired
    private EstacionamentoServices estacionamentoServices;

    @Autowired
    private RepositoryVeiculo repositoryVeiculo;

    public VeiculoResponse criar(VeiculoRequest veiculoRequest) {

        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(veiculoRequest.getModelo());
        veiculo.setPlacaCarro(veiculoRequest.getPlacaCarro());
        veiculo.setHoraEntrada(veiculoRequest.getHoraEntrada());
        veiculo.setHoraSaida(veiculoRequest.getHoraSaida());
        veiculo.setPagamento(veiculoRequest.getPagamento());

        Veiculo veiculoCriado = repositoryVeiculo.save(veiculo);
        VeiculoResponse veiculoResponse = new VeiculoResponse();

        return veiculoResponse;
    }

    public Veiculo atualizar(Veiculo veiculo, Long id) {
        Veiculo veiculoObtido = this.obter(id);
        veiculoObtido.setNomeMotorista(veiculo.getNomeMotorista());
        repositoryVeiculo.save(veiculoObtido);

        return veiculoObtido;

    }

    @Override
    public void deletar(Long id) {
        repositoryVeiculo.deleteById(id);

    }

    public Veiculo obter(Long id) {
        Veiculo veiculo = repositoryVeiculo.findById(id).get();
        return veiculo;

    }

    public List<Veiculo> listar() {
        List<Veiculo> listarVeiculo = repositoryVeiculo.findAll();

        return listarVeiculo;

    }
}