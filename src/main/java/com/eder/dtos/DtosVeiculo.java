package com.eder.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtosVeiculo {

    private String modelo;
    @Size(min = 7, max = 7, message = "Placa invalida! ")
    private String placaCarro;
    private String horaEntrada;
    private String horaSaida;

    @Size (min = 4, message = "Aceitar somente, dinheiro, cartão Debito ou credito")
    private String Pagamento;
}
