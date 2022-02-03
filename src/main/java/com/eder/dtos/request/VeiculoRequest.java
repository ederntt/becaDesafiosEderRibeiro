package com.eder.dtos.request;

import com.eder.modulos.Estac;

public class VeiculoRequest {

    private String nomeMotorista;
    private String cpf;
    private String placaCarro;
    private String horaEntrada;
    private String horaSaida;
    private String pagamento;
    private Estac estac;

    public VeiculoRequest() {
    }

    public VeiculoRequest(String nomeMotorista, String cpf, String placaCarro, String horaEntrada, String horaSaida, String pagamento, Estac estac) {
        this.nomeMotorista = nomeMotorista;
        this.cpf = cpf;
        this.placaCarro = placaCarro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.pagamento = pagamento;
        this.estac = estac;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public Estac getEstac() {
        return estac;
    }

    public void setEstac(Estac estac) {
        this.estac = estac;
    }
}


