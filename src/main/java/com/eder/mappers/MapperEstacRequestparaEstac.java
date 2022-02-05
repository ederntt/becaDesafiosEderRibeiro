package com.eder.mappers;

import com.eder.dtos.request.EstacionamentoRequest;
import com.eder.modulos.Estac;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MapperEstacRequestparaEstac {
    @Mapping(target = "nome", source = "estac")
public Estac toModel(EstacionamentoRequest estacionamentoRequest);

}
