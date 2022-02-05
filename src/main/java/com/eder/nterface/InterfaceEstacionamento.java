package com.eder.nterface;

import com.eder.dtos.responses.EstacResponse;
import com.eder.modulos.Estac;

import java.util.List;

public interface InterfaceEstacionamento {

    public Estac criar(Estac estac);

    public Estac atualizar( Estac estac,  Long id);

    public void deletar(Long id);

    public List<EstacResponse> listar();

    public EstacResponse obter(Long id);
}
