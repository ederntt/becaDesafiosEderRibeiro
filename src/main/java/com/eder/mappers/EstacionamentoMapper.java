package com.eder.mappers;

import com.eder.dtos.responses.EstacResponse;
import com.eder.modulos.Estac;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper
public interface EstacionamentoMapper {

       Estac estac (EstacResponse estacResponse);

        @InheritInverseConfiguration
        EstacResponse estacResponse (Estac estac);
    }
