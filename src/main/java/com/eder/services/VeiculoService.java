package com.eder.services;

import com.eder.Interface.InterfaceVeiculo;
import com.eder.Modulos.Estac;
import com.eder.Modulos.Veiculo;
import com.eder.dtos.request.VeiculoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
        //implements InterfaceVeiculo {
@Autowired
    private EstacionamentoServices estacionamentoServices;

        public Veiculo criar(VeiculoRequest veiculoRequest) {
            Estac estacObter = estacionamentoServices.obter(veiculoRequest.getIdCpf());


            Veiculo veiculo = new Veiculo();
            veiculo.setNomeMotorista( veiculoRequest.getNome());
veiculo.setCpf(String.valueOf(estacObter));

veiculo veiculoCriado = repo
//      if (veiculo.getNomeMotorista().length()< 3) {
//           throw new RuntimeException("Nome do motorista noa pode ser menor que 3 caracteres");
//       }
//         veiculo.setId(2L);
            return veiculoRequest;
        }

        public Veiculo atualizar(Veiculo veiculo, Long id) {

            Veiculo veiculoAtualizar = veiculoService.atualizar(veiculo, 4L);
            return veiculo;
        }

        public void deletar(Long id) {
            //
        }

        public Veiculo obter(Long id) {
            Veiculo veiculo = new Veiculo("Alberto", "12345678-90", "avb123",
                    "14:20", "15:10", "Débito");

            Veiculo veiculo1 = new Veiculo("Roberto", "0652347233-06", "acd3456",
                    "13:45", "16:43", "Credito");

            Veiculo veiculo2 = new Veiculo("Camila", "1234667788-08", "tyu7654",
                    "21:45", "07:43", "Debito");

            return veiculo;
        }

        public List<Veiculo> listar() {
            Estac est1 = new Estac();
            est1.setNome(String.valueOf(1L));
            est1.setNome("Caio");

            Estac est2 = new Estac();
            est2.setNome(String.valueOf(2L));
            est2.setNome("Miranda");


            Veiculo veiculo = new Veiculo("Alberto", "12345678-90", "avb123",
                    "14:20", "15:10", "Débito");

            Veiculo veiculo1 = new Veiculo("Roberto", "0652347233-06", "acd3456",
                    "13:45", "16:43", "Credito");

            Veiculo veiculo2 = new Veiculo("Camila", "1234667788-08", "tyu7654",
                    "21:45", "07:43", "Debito");

            return List.of(veiculo,
                    veiculo1,
                    veiculo2
            );
        }
}