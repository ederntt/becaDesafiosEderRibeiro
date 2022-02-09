package com.eder.services;

import com.eder.exception.TratamentoErros;
import com.eder.mappers.MapperEstacionamento;
import com.eder.modulos.Estac;
import com.eder.nterface.InterfaceEstacionamento;
import com.eder.repository.RepositoryEstac;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstacionamentoServices implements InterfaceEstacionamento {

    private final RepositoryEstac repositoryEstac;
    private final MapperEstacionamento mapperEstacionamento;

    @Override
    public Estac criar (Estac estac){
        return repositoryEstac.save(estac);
    }

    public Estac atualizar(Estac estac, Long id) {

        Estac modificar = this.obter(id);
        modificar.setNome(estac.getNome());
        modificar.setData(estac.getData());
        modificar.setFaturamentoGeral(estac.getFaturamentoGeral());
        repositoryEstac.save(modificar);

        return modificar;
    }

    public void deletar(Long id) {
        repositoryEstac.deleteById(id);
    }

    public List<Estac> listar(){
        return repositoryEstac.findAll();
    }

    public Estac obter(Long id) {
        Estac estac = repositoryEstac.findById(id).get();
            if (estac == null) {
                throw new TratamentoErros(" opção indisponivel");
            }
        return repositoryEstac.findById(id)
                .orElseThrow(TratamentoErros::new);
    }
}