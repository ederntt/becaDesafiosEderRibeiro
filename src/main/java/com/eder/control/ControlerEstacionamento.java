package com.eder.control;

import com.eder.modulos.Estac;
import com.eder.services.EstacionamentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estacionamento")
public class ControlerEstacionamento {

    @Autowired
    private EstacionamentoServices estacionamentoServices;

    @PostMapping
    public ResponseEntity<Estac> criar(@RequestBody Estac estac) {
        Estac estacCriado = estacionamentoServices.criar(estac);

        return ResponseEntity.created(null).body(estacCriado);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Estac> atualizar(@RequestBody Estac estac, @PathVariable Long id) {
        Estac estacAtualizar = estacionamentoServices.atualizar(estac, id);

        return ResponseEntity.ok(estacAtualizar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        estacionamentoServices.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estac> obter(@PathVariable Long id) {
        Estac obterEstac = estacionamentoServices.obter(3L);

        return ResponseEntity.ok(obterEstac);
    }

    @GetMapping
    public ResponseEntity<List<Estac>> listar() {
        List<Estac> listar = estacionamentoServices.listar();
        return ResponseEntity.ok(listar);

    }


}
