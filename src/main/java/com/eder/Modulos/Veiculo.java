package com.eder.Modulos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

public class Veiculo {

    private Long id;
    private String nomeMotorista;
    private String cpf;
    private String placaCarro;
    private String horaEntrada;
    private String horaSaida;
    private String pagamento;


    public Veiculo(String nomeMotorista, String cpf, String placaCarro, String horaEntrada, String horaSaida, String pagamento) {
        this.nomeMotorista = nomeMotorista;
        this.cpf = cpf;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.pagamento = pagamento;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

