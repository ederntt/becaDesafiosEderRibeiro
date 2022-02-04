package com.eder.services;

import com.eder.nterface.InterfaceEstacionamento;
import com.eder.modulos.Estac;
import com.eder.modulos.Veiculo;
import com.eder.repository.RepositoryEstac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionamentoServices implements InterfaceEstacionamento {

    @Autowired
    private RepositoryEstac repositoryEstac;

    public Estac criar(Estac estac) {
        return repositoryEstac.save(estac);
    }

    public Estac atualizar(Estac estac, Long id) {
//        Estac estacObtido = this.obter(id);
//        estacObtido.setData(estac.getData());
//        estacObtido.setFaturamentoGeral(estac.getFaturamentoGeral());
//        estacObtido.setTelefone(estac.getTelefone());
//
//        repositoryEstac.save(estacObtido);
//
//        return estacObtido;

        return repositoryEstac.findById(id)
                .map(vc -> {
                    vc.setData(estac.getData());
                    vc.setFaturamentoGeral(estac.getFaturamentoGeral());
                    vc.setTelefone(estac.getTelefone());

                    return   repositoryEstac.save(vc);
                }).orElseThrow(RuntimeException:: new);

    }

    public void deletar(Long id) {
        repositoryEstac.deleteById(id);
    }

    public List<Estac> listar() {
        return repositoryEstac.findAll();
    }

    public Estac obter(Long id) {
        return repositoryEstac.findById(id)
                .orElseThrow(RuntimeException::new);
    }
}