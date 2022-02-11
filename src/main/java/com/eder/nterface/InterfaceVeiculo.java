package com.eder.nterface;

import com.eder.modulos.Veiculo;
import java.util.List;

public interface InterfaceVeiculo {

    public Veiculo criar(Veiculo veiculo);

    public Veiculo atualizar(Veiculo veiculo, Long id);

    public void deletar(Long id);

    Veiculo obter(Long id);

    public List<Veiculo> listar();

}
