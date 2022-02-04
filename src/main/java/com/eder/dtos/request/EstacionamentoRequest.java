package com.eder.dtos.request;

import com.eder.modulos.Veiculo;

public class EstacionamentoRequest {

    private Long id;
    private String nome;
    private String telefone;
    private Double faturamentoGeral;
    private String data;
    private String modelo;
    private Veiculo veiculo;

    public EstacionamentoRequest() {
    }

    public EstacionamentoRequest(Long id, String nome, String telefone, Double faturamentoGeral, String data, String modelo, Veiculo veiculo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.faturamentoGeral = faturamentoGeral;
        this.data = data;
        this.modelo = modelo;
        this.veiculo = veiculo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getFaturamentoGeral() {
        return faturamentoGeral;
    }

    public void setFaturamentoGeral(Double faturamentoGeral) {
        this.faturamentoGeral = faturamentoGeral;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

}
