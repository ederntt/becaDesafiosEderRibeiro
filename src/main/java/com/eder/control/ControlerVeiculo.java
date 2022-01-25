package com.eder.control;

import com.eder.Modulo.Estac;
import com.eder.Modulo.Veiculo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class ControlerVeiculo {

        @PostMapping
        public ResponseEntity<Veiculo> criar(@RequestBody Veiculo veiculo) {
            veiculo.setId(2L);
            return ResponseEntity.created(null).body(veiculo);
        }

        @RequestMapping("/{id}")
        public ResponseEntity deletar(@PathVariable long id) {
            return ResponseEntity.noContent().build();
        }

        @PatchMapping("/{id}")
        public ResponseEntity<Veiculo> atualizar(@RequestBody Veiculo veiculo, @PathVariable long id) {
            veiculo.setId(id);
            return ResponseEntity.ok(veiculo);

        }

        @GetMapping("/{id}")
        public ResponseEntity<Veiculo> obter(@PathVariable Long id) {
            Veiculo veiculo = new Veiculo();
            veiculo.setId(id);
            veiculo.setNomeMotorista("Marcos Vidal");

            return ResponseEntity.ok(veiculo);
        }

        @GetMapping
        public ResponseEntity<List<Veiculo>> listar() {
            Estac est1 = new Estac();
            est1.setNome(String.valueOf(1L));
            est1.setNome("Caio");

            Estac est2 = new Estac();
            est2.setId(2L);
            est2.setNome("Miranda");


            Veiculo veiculo1 = new Veiculo();
            veiculo1.setId(3L);
            veiculo1.setNomeMotorista("Maria do Carmo");
            veiculo1.setNomeMotorista(String.valueOf(est1));

            Veiculo veiculo2 = new Veiculo();
            veiculo2.setId(2L);
            veiculo2.setNomeMotorista("Pedro Alvarez");
            veiculo1.setNomeMotorista(String.valueOf(est2));

            Veiculo veiculo3 = new Veiculo();
            veiculo3.setId(3L);
            veiculo3.setNomeMotorista("carminha");


            return ResponseEntity.ok(

                    List.of(veiculo1,
                            veiculo2,
                            veiculo3
                    )
            );
        }
    }
