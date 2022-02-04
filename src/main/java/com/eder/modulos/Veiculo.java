package com.eder.modulos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMotorista;
    private String cpf;
    private String placaCarro;
    private String horaEntrada;
    private String horaSaida;
    private String pagamento;
    private String modelo;

    @ManyToOne
    private Estac estac;

    }

