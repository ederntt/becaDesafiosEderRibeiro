package com.eder.control;

import com.eder.Modulo.Estac;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estacionamento")
public class ControlerEstacionamento {

    @PostMapping
    public ResponseEntity<Estac> criar(@RequestBody Estac estac) {

        System.out.println(estac);

        return ResponseEntity.created(null).body(estac);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<Estac> atualizar(@RequestBody Estac estac, @PathVariable long id) {
        Estac.setId(2L);

        return ResponseEntity.ok(estac);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable long id) {
        //  ("deletou como pedido" + id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List> listar() {

        Estac est1 = new Estac();
        est1.setNome(String.valueOf(1L));
        est1.getNome("Meriva");

        Estac est2 = new Estac();
        est2.setId(2L);
        est2.setNome("Fox");


        Estac est3 = new Estac();
        est3.setId(2L);
        est3.setNome("Cadillac");


        Estac est4 = new Estac();
        est4.setId(2L);
        est4.setNome("BMW");


        Estac est5 = new Estac();
        est5.setId(2L);
        est5.setNome("Gol");


        return ResponseEntity.ok(List.of(
                est1,
                est2,
                est3,
                est4,
                est5)
        );

    }

    @GetMapping("/{id}") // cod_estacionamento
    public ResponseEntity<Estac> obter(@PathVariable long id) {
        Estac est1 = new Estac();
        est1.setId(2L);
        est1.setNome("Carros");
        return ResponseEntity.ok(est1);
    }
}
