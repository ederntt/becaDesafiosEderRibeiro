package com.eder.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtosEstacionamento {

    private Long id;
    private String nome;
    private String telefone;
    private Double faturamentoGeral;
    private String data;


}
