package com.eder.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoRequest {


    private String modelo;
    private String placaCarro;
    private String horaEntrada;
    private String horaSaida;
    private String Pagamento;
    private EstacionamentoRequest estacionamentoRequest;


//    public VeiculoRequest() {
//    }
//
//    public VeiculoRequest(Long id, String modelo ) {
//        this.id = id;
//        this.modelo = modelo;
//    }
//
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }


}


