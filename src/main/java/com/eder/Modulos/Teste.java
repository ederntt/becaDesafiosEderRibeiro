package com.eder.Modulos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Teste {
    public static void main (String[] args) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat(("dd/MM/yyy HH:mm"));
        Veiculo vc = new Veiculo();
        vc.setNomeMotorista("Jose Roberto");
        vc.setPlacaCarro("ASD1234");
        vc.setCpf("12334566-7");
        vc.setHoraEntrada("12:12");
        vc.setHoraSaida("14:12");
        vc.setPagamento("dinheiro");

      //  System.out.println(vc.getNomeMotorista());

    }
}
