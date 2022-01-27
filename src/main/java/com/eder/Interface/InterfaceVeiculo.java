package com.eder.Interface;

import com.eder.Modulos.Veiculo;

import java.util.List;

public interface InterfaceVeiculo {

    public Veiculo criar(Veiculo veiculo);

    public Veiculo atualizar(Veiculo veiculo, Long id);

    public void deletar(Long id);

    public Veiculo obter(Long id);

    public List<Veiculo> listar();
}
