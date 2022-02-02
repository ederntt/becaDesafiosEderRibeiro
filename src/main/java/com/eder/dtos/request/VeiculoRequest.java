package com.eder.dtos.request;

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
