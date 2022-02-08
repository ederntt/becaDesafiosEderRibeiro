package com.eder.modulos;

import com.eder.dtos.DtosVeiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Veiculo extends DtosVeiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

