package com.eder.Modulos;

import java.time.LocalDate;


public class Estac {

    private String nome;
    private String telefone;
    private Double faturamentoGeral;
    private LocalDate data;
    private String listarVeiculos;
    private Veiculo veiculo;
    private Long id;

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getListarVeiculos() {
        return listarVeiculos;
    }

    public void setListarVeiculos(String listarVeiculos) {
        this.listarVeiculos = listarVeiculos;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

