package com.eder.Modulos;

import javax.persistence.*;
import java.util.List;

@Entity
//@SequenceGenerator(name= "estac_seq", sequenceName = "estac_seq",
//initialValue = 1, allocationSize = 1)
public class Estac {
    @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estac_seq")
    private Long id;
    private String nome;
    private String telefone;
    private Double faturamentoGeral;
    private String data;
    private String listarVeiculos;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "estac")
    private List<Veiculo> veiculos;

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

    public String getListarVeiculos() {
        return listarVeiculos;
    }

    public void setListarVeiculos(String listarVeiculos) {
        this.listarVeiculos = listarVeiculos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}

