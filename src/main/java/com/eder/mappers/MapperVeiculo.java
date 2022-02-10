package com.eder.mappers;

import com.eder.dtos.DtosVeiculo;
import com.eder.modulos.Veiculo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper
public interface MapperVeiculo {

    List<DtosVeiculo> veiculoToDtoVeiculo(List<Veiculo> veiculo);

    DtosVeiculo veiculoToDtoVeiculo(Veiculo veiculo);

    Veiculo veiculoToDtoVeiculo(DtosVeiculo dtosVeiculo);

    void atualizar(Veiculo veiculo, @MappingTarget DtosVeiculo dto);
}
