package com.eder.Interface;

import com.eder.Modulos.Estac;

import java.util.List;

public interface InterfaceEstacionamento {

    public Estac criar(Estac estac);

    public Estac atualizar( Estac estac,  Long id);

    public void deletar(Long id);

    public List<Estac> listar();

    public Estac obter(Long id);
}
