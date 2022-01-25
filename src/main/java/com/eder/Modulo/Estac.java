package com.eder.Modulo;

import java.time.LocalDate;

public class Estac {


    private String nome;
    private String telefone;
    private Double faturamentoGeral;
    private LocalDate data;
    private String listarVeiculos;

    public String getNome(String nome) {
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

    public Estac() {
    }

    public Estac(String nome, String telefone, Double faturamentoGeral, LocalDate data, String listarVeiculos) {
        this.nome = nome;
        this.telefone = telefone;
        this.faturamentoGeral = faturamentoGeral;
        this.data = data;
        this.listarVeiculos = listarVeiculos;
    }


    public static void setId(long l) {
    }
}

