package com.eder.nterface;

import com.eder.dtos.DtosVeiculo;
import com.eder.modulos.Veiculo;

import java.util.List;

public interface InterfaceVeiculo {

    Veiculo criar(DtosVeiculo dtosVeiculo);

//    public Veiculo criar(Veiculo veiculo);

    Veiculo atualizar(DtosVeiculo veiculo, Long id);

    void deletar(Long id);

    Veiculo obter(Long id);

    List<Veiculo> listar();

}
