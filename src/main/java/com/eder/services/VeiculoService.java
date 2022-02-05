package com.eder.services;

import com.eder.dtos.responses.VeiculoResponse;
import com.eder.mappers.*;
import com.eder.modulos.Veiculo;
import com.eder.dtos.request.VeiculoRequest;
import com.eder.nterface.InterfaceVeiculo;
import com.eder.repository.RepositoryVeiculo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class VeiculoService implements InterfaceVeiculo {

    private final EstacionamentoServices estacionamentoServices;
    private final RepositoryVeiculo repositoryVeiculo;
    private final VeiculoMapper mapperVeiculoRequest;
    private final MapperVeiculoVeiResp mapperVeiculoVeiResp;
    private final MapperVeiculoAtualizar mapperVeiculoAtualizar;

    public VeiculoResponse criar(VeiculoRequest veiculoRequest) {

        RequestVeiMap veiculoMapper = null;
        VeiculoRequest VeiculoRequest = null;
        Veiculo veiculo = veiculoMapper.toModel(VeiculoRequest);

       repositoryVeiculo.save(veiculo);

       VeiculoResponse veiculoResponse = mapperVeiculoVeiResp.toResponse(veiculo);

//        VeiculoResponse veiculoResponse = new VeiculoResponse();
//        veiculo.setModelo(veiculoRequest.getModelo());
//        veiculo.setPlacaCarro(veiculoRequest.getPlacaCarro());
//        veiculo.setHoraEntrada(veiculoRequest.getHoraEntrada());
//        veiculo.setHoraSaida(veiculoRequest.getHoraSaida());
//        veiculo.setPagamento(veiculoRequest.getPagamento());

//        Veiculo veiculoCriado = repositoryVeiculo.save(veiculo);

        return veiculoResponse;
    }

    @Override
    public Veiculo atualizar(Veiculo veiculo, Long id) {
        return null;
    }

    public VeiculoResponse atualizar(VeiculoRequest veiculoRequest, Long id) {
        Veiculo veiculoObtido = repositoryVeiculo.findById(id).get();

mapperVeiculoAtualizar.atualizar(veiculoRequest, veiculoObtido);
        repositoryVeiculo.save(veiculoObtido);

        return mapperVeiculoVeiResp.toResponse(veiculoObtido);

    }

    public void deletar(Long id) {
        repositoryVeiculo.deleteById(id);

    }

    public VeiculoResponse obter(Long id) {

     Veiculo veiculo = repositoryVeiculo.findById(id).get();
        return mapperVeiculoVeiResp.toResponse(veiculo);

    }

    public List<VeiculoResponse> listar() {
        List<Veiculo> listarVeiculo = repositoryVeiculo.findAll();

       return listarVeiculo
                .stream()
                .map(mapperVeiculoVeiResp::toResponse)
                .collect(Collectors.toList());
    }
}