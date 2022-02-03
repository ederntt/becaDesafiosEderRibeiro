package com.eder.services;

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

    @Override
    public Veiculo criar(Veiculo veiculoRequest) {

        Veiculo veiculoCriado = repositoryVeiculo.save(veiculoRequest);

        return veiculoCriado;
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


//    public GetVeiculoObtido obter(Long id) {
//   Veiculo veiculo= repositoryVeiculo.findById(id).get();
//   GetVeiculoObtido getVeiculoObtido = new GetVeiculoObtido();
//   getVeiculoObtido.setId(veiculo,getId());
//
//        return getVeiculoObtido;
//    }

    public List<Veiculo> listar() {
        List<Veiculo> listarVeiculo = repositoryVeiculo.findAll();

        return listarVeiculo;

    }
}