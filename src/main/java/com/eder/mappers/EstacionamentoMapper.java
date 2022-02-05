package com.eder.mappers;

import com.eder.dtos.responses.EstacResponse;
import com.eder.modulos.Estac;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper
public interface EstacionamentoMapper { // estacionamento response

       public EstacResponse toResponse (Estac estac);

//        @InheritInverseConfiguration
//        EstacResponse estacResponse (Estac estac);
    }
