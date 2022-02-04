package com.eder.dtos.request;

import com.eder.modulos.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Cria get, set, toString
@AllArgsConstructor //faz construtor com todos os argumentos
@NoArgsConstructor //faz construtor sem argumentos(VAZIO)
public class EstacionamentoRequest {

    private Long id;
    private String nome;
    private String telefone;
    private Double faturamentoGeral;
    private String data;
    private String modelo;
    private Veiculo veiculo;

}
