package com.eder.mappers;

import com.eder.dtos.responses.VeiculoResponse;
import com.eder.modulos.Veiculo;

public interface MapperVeiculoVeiResp { //veiculo para veiculo response
    public VeiculoResponse toResponse(Veiculo veiculo);
}
