package com.eder.mappers;

import com.eder.dtos.responses.VeiculoResponse;
import com.eder.modulos.Veiculo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper
public interface VeiculoMapper {
    Veiculo veiculo (VeiculoResponse veiculoResponse);

    @InheritInverseConfiguration
    VeiculoResponse veiculoResponse (Veiculo veiculo);
}
