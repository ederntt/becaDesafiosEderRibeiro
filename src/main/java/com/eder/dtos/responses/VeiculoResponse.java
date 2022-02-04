package com.eder.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoResponse {

    private Long id;
    private String nomeMotorista;
    private String placaCarro;
    private String horaEntrada;
    private String horaSaida;
    private String pagamento;


}
