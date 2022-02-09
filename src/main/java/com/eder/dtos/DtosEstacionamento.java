package com.eder.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtosEstacionamento {

    private Long id;
    private String nome;
    private String telefone;
    @Positive
    private Double faturamentoGeral;
    private String data;

}
