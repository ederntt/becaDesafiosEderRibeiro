package com.eder.dtos;

import com.eder.modulos.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtosVeiculo extends Veiculo {

    private String modelo;
    @Size (min = 7, message = "A placa deve conter no minimo 7 caracteres")
    private String placaCarro;
    private String horaEntrada;
    private String horaSaida;

    @Size (min = 4, message = "Aceitar somente: dinheiro, cartão Debito ou credito")
    private String Pagamento;
}
