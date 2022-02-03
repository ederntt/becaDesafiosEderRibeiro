package com.eder.dtos.responses;

import com.eder.modulos.Veiculo;

public class GetVeiculoObtido {
    private String id;
    private String nome;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Veiculo veiculo, Object id) {
    }
}
