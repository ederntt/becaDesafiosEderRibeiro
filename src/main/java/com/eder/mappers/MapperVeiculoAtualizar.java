package com.eder.mappers;

import com.eder.dtos.request.VeiculoRequest;
import com.eder.modulos.Veiculo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperVeiculoAtualizar {

    public void atualizar (VeiculoRequest veiculoRequest,@MappingTarget Veiculo veiculo);
}
