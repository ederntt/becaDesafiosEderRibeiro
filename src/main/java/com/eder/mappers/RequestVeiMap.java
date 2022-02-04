package com.eder.mappers;

import com.eder.dtos.request.EstacionamentoRequest;
import com.eder.dtos.request.VeiculoRequest;
import com.eder.modulos.Estac;
import com.eder.modulos.Veiculo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

public interface RequestVeiMap {

    @Mapper
    public interface EstacMapper {
        Veiculo veiculo (VeiculoRequest veiculoRequest);

        @InheritInverseConfiguration
        VeiculoRequest veiculoRequest(Veiculo Veiculo);
    }
}
