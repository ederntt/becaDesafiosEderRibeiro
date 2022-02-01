package com.eder.services;

import com.eder.Interface.InterfaceVeiculo;
import com.eder.Modulos.Estac;
import com.eder.Modulos.Veiculo;
import com.eder.Repository.RepositoryVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class VeiculoService implements InterfaceVeiculo{

    @Autowired
    private EstacionamentoServices estacionamentoServices;

    @Autowired
    private RepositoryVeiculo repositoryVeiculo;

    @Override
    public Veiculo criar(Veiculo veiculo) {
        Veiculo veiculoCriar = repositoryVeiculo.save(veiculo);

      return veiculoCriar;
    }

    @Override
    public Veiculo atualizar(Veiculo veiculo, Long id) {

       Veiculo veiculoObtido = this.obter(id);
       veiculoObtido.setNomeMotorista(veiculo.getNomeMotorista());
//       veiculoObtido.setCpf(veiculo.getCpf());
//       veiculoObtido.setPlacaCarro(veiculo.getPlacaCarro());
//       veiculoObtido.setHoraEntrada(veiculo.getHoraEntrada());
//       veiculoObtido.setHoraSaida(veiculo.getHoraSaida());
//       veiculoObtido.setPagamento(veiculo.getPagamento());

        repositoryVeiculo.save(veiculoObtido);

        return veiculoObtido;
    }

    @Override
    public void deletar(Long id) {
        repositoryVeiculo.deleteById(id);
    }

    @Override
    public Veiculo obter(Long id) {

        Veiculo veiculo = repositoryVeiculo.findById(id).get();

        return veiculo;
    }

  @Override
    public List<Veiculo> listar() {
        List<Veiculo> listarVeiculo = repositoryVeiculo.findAll();

        return listarVeiculo;
//        List<Veiculo> listaVe = repositoryVeiculo.findAll();
//
//        return listaVe;

    }
}