package com.eder.services;

import com.eder.dtos.request.EstacionamentoRequest;
import com.eder.dtos.responses.EstacResponse;
import com.eder.mappers.EstacionamentoMapper;
import com.eder.mappers.MapperEstacAtualizar;
import com.eder.mappers.MapperEstacRequestparaEstac;
import com.eder.nterface.InterfaceEstacionamento;
import com.eder.modulos.Estac;
import com.eder.repository.RepositoryEstac;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EstacionamentoServices implements InterfaceEstacionamento {


    private final RepositoryEstac repositoryEstac;
    private final MapperEstacRequestparaEstac mapperEstacRequestparaEstac;
    private final EstacionamentoMapper estacionamentoMapper;
    private final MapperEstacAtualizar mapperEstacAtualizar;

    public EstacResponse criar(EstacionamentoRequest estacionamentoRequest) {

        Estac estac = mapperEstacRequestparaEstac.toModel(estacionamentoRequest);

        repositoryEstac.save(estac);

        EstacResponse estacResponse = estacionamentoMapper.toResponse(estac);

        return estacResponse;
    }

    public EstacResponse atualizar(EstacionamentoRequest estacionamentoRequest, Long id) {
        Estac estacObtido = repositoryEstac.findById(id).get();

        mapperEstacAtualizar.atualizar(estacionamentoRequest, estacObtido);

        repositoryEstac.save(estacObtido);

        EstacResponse estacResponse = estacionamentoMapper.toResponse(estacObtido);

        return estacResponse;

//        return repositoryEstac.findById(id)
//                .map(vc -> {
//                    vc.setData(estac.getData());
//                    vc.setFaturamentoGeral(estac.getFaturamentoGeral());
//                    vc.setTelefone(estac.getTelefone());
//
//                    return repositoryEstac.save(vc);
//                }).orElseThrow(RuntimeException::new);

    }

    @Override
    public Estac criar(Estac estac) {
        return null;
    }

    @Override
    public Estac atualizar(Estac estac, Long id) {
        return null;
    }

    public void deletar(Long id) {
        repositoryEstac.deleteById(id);
    }

    public List<EstacResponse> listar() {
        List<Estac> estacList = repositoryEstac.findAll();

        return estacList
                .stream()
                .map(estacionamentoMapper::toResponse)
                .collect(Collectors.toList());
    }

    public EstacResponse obter(Long id) {
        Estac estac = repositoryEstac.findAllById(Collections.singleton(id)).get(); // verificar com flavius
        if(estac == null ) {
            throw new RuntimeException(" bla bla");
        }
//        return repositoryEstac.findById(id)
//                .orElseThrow(RuntimeException::new);
        return estacionamentoMapper.toResponse(estac);
    }
}