package com.eder.mappers;

import com.eder.dtos.DtosEstacionamento;
import com.eder.modulos.Estac;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperEstacionamento {
    List<DtosEstacionamento> estacToDtoEstac (List<Estac> estac);

    DtosEstacionamento estacToDtoEstac (Estac estac);

    Estac estacToDtoEstac (DtosEstacionamento dtosEstacionamento);
}
