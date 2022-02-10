package com.eder.dtos;

import com.eder.modulos.Estac;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtosEstacionamento extends Estac {

    private Long id;
    private String nome;
    private String telefone;
    private Double faturamentoGeral;
    private String data;

}
