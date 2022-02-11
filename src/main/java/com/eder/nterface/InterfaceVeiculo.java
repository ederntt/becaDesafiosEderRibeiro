package com.eder.nterface;

import com.eder.dtos.DtosVeiculo;
import com.eder.modulos.Veiculo;
import java.util.List;

public interface InterfaceVeiculo {

    DtosVeiculo criar(DtosVeiculo dtosVeiculo);

    Veiculo atualizar(DtosVeiculo veiculo, Long id);

    void deletar(Long id);

    Veiculo obter(Long id);

    List<Veiculo> listar();


}