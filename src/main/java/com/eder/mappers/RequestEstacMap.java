package com.eder.mappers;

import com.eder.dtos.request.EstacionamentoRequest;
import com.eder.modulos.Estac;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

public interface RequestEstacMap {

    @Mapper
    public interface EstacMapper {
        Estac estac (EstacionamentoRequest estacionamentoRequest);

        @InheritInverseConfiguration
        EstacionamentoRequest estacionamentoRequest(Estac estac);
    }
}
