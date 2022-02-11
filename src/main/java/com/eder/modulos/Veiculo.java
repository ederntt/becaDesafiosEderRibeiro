package com.eder.modulos;

import com.eder.dtos.DtosVeiculo;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Veiculo extends DtosVeiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMotorista;
    private String cpf;
    private String modelo;
    private String placaCarro;
    private String horaEntrada;
    private String horaSaida;
    private String pagamento;
    @ManyToOne
    private Estac estac;

    }

