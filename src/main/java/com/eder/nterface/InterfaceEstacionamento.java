package com.eder.nterface;

import com.eder.modulos.Estac;
import java.util.List;

public interface InterfaceEstacionamento {

    Estac criar(Estac estac);

    Estac atualizar( Estac estac,  Long id);

    void deletar(Long id);

    List<Estac> listar();

    Estac obter(Long id);
}