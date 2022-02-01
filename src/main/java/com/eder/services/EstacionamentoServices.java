package com.eder.services;

import com.eder.Interface.InterfaceEstacionamento;
import com.eder.Modulos.Estac;
import com.eder.Modulos.Veiculo;
import com.eder.Repository.RepositoryEstac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionamentoServices implements InterfaceEstacionamento {

    @Autowired
    private RepositoryEstac repositoryEstac;

    private EstacionamentoServices estacionamentoServices;

    @Override
    public Estac criar(Estac estac) {

        return repositoryEstac.save(estac);
    }

    @Override
    public Estac atualizar(Estac estac, Long id) {
        Estac estacObtido = this.obter(id);
        //Estac estacAtualizar = estacionamentoServices.atualizar(estac, id);

        estacObtido.setNome(estac.getNome());

        repositoryEstac.save(estacObtido);

        return estacObtido;
    }

    @Override
    public void deletar(Long id) {

        repositoryEstac.deleteById(id);
        // return ResponseEntity.noContent().build();
    }

    @Override
    public List<Estac> listar() {
        List<Estac> listaEstac = repositoryEstac.findAll();

////         Estac listar = estacionamentoServices.listar();
//        Estac est1 = new Estac();
//        est1.setId(1L);
//        est1.setNome("Caio");
//        est1.setTelefone("4132324455");
//        est1.setFaturamentoGeral(25.000);
//        est1.setListarVeiculos("meriva, fox, gol, up, corsa");
//
//        Estac est2 = new Estac();
//        est2.setId(2L);
//        est2.setNome("Miranda");
//        est2.setTelefone("423567890");
//        est2.setFaturamentoGeral(27.000);
//        est2.setListarVeiculos("meriva, fox, gol, up, corsa");
//
//        Estac est3 = new Estac();
//        est3.setId(3L);
//        est3.setNome("Carmem");
//        est3.setTelefone("4255667788");
//        est3.setFaturamentoGeral(34.000);
//        est3.setListarVeiculos("meriva, fox, gol, up, corsa");

//
//        return List.of(
//                est1,
//                est2,
//                est3 );
        return listaEstac;

    }

    @Override
    public Estac obter(Long id) {
        Estac estac = repositoryEstac.findById(id).get();
        // Estac estacObter = estacionamentoServices.obter(1L);

        if (estac == null)
            throw new RuntimeException("id Estac nao foi encontrado");

        return estac;
    }
}