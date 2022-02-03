package com.eder.dtos.request;

import com.eder.modulos.Estac;

public class VeiculoRequest {

    private String nome;
    private Long idCpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdCpf() {
        return idCpf;
    }

    public void setIdCpf(Long idCpf) {
        this.idCpf = idCpf;
    }
}
