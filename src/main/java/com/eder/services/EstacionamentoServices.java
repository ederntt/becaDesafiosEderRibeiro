package com.eder.services;

import com.eder.Interface.InterfaceEstacionamento;
import com.eder.Modulos.Estac;
import com.eder.Modulos.Veiculo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionamentoServices implements InterfaceEstacionamento {


    private EstacionamentoServices estacionamentoServices;

    public Estac criar(Estac estac) {

        System.out.println(estac);
        if (estac.getFaturamentoGeral()<= 15.00) {
            throw new RuntimeException("Valor do faturamento não pode ser menos de 15 reais");
        }

        if (estac.getTelefone().length() < 3) {
            throw new RuntimeException("telefone não pode ter menos de 4 caracteres");
        }

        if (estac.getNome().length() < 3) {
            throw new RuntimeException("nome não pode ter menos de 3 caracteres");
        }
        estac.setId(1L);

        return estac;

    }


    public Estac atualizar( Estac estac,  Long id) {

        Estac estacAtualizar = estacionamentoServices.atualizar(estac, 5L);

        return estac;

    }


    public void deletar(Long id) {

      // EstacionamentoServices.deletar(id);

      // return ResponseEntity.noContent().build();
    }

    public List<Estac> listar() {

//         Estac listar = estacionamentoServices.listar();
        Estac est1 = new Estac();
        est1.setId(1L);
        est1.setNome("Caio");
        est1.setTelefone("4132324455");
        est1.setFaturamentoGeral(25.000);
        est1.setListarVeiculos("meriva, fox, gol, up, corsa");

       Estac est2 = new Estac();
        est2.setId(2L);
        est2.setNome("Miranda");
        est2.setTelefone("423567890");
        est2.setFaturamentoGeral(27.000);
        est2.setListarVeiculos("meriva, fox, gol, up, corsa");

        Estac est3 = new Estac();
        est3.setId(3L);
        est3.setNome("Carmem");
        est3.setTelefone("4255667788");
        est3.setFaturamentoGeral(34.000);
        est3.setListarVeiculos("meriva, fox, gol, up, corsa");

        Veiculo veiculo = new Veiculo("Alberto","12345678-90","avb123",
                "14:20", "15:10","Débito");

        return List.of(
                est1,
                est2,
                est3
        );

    }


    public Estac obter(Long id) {

        Estac estacObter = estacionamentoServices.obter(1L);

        return estacObter;
    }
}