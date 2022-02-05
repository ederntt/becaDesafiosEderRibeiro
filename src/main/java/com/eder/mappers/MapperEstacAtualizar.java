package com.eder.mappers;

import com.eder.dtos.request.EstacionamentoRequest;
import com.eder.modulos.Estac;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperEstacAtualizar {
    public void atualizar( EstacionamentoRequest estacionamentoRequest, @MappingTarget Estac estac);
}
