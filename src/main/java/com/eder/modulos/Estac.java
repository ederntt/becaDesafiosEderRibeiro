package com.eder.modulos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Estac {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String telefone;
    private Double faturamentoGeral;
    private String data;
    private String modelo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "estac")
    @JsonIgnore
    private List<Veiculo> veiculos;

    public Estac() {
    }

    public Estac(Long id, String nome, String telefone, Double faturamentoGeral, String data, String modelo, List<Veiculo> veiculos) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.faturamentoGeral = faturamentoGeral;
        this.data = data;
        this.modelo = modelo;
        this.veiculos = veiculos;
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

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}

