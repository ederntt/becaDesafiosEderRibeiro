package com.eder.mappers;

import com.eder.dtos.request.VeiculoRequest;
import com.eder.modulos.Veiculo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper
public interface RequestVeiMap { //veiculo request
        public Veiculo toModel (VeiculoRequest veiculoRequest);

       @InheritInverseConfiguration
       VeiculoRequest veiculoRequest(Veiculo Veiculo);
    }

