package com.eder.control;

import com.eder.dtos.DtosEstacionamento;
import com.eder.mappers.MapperEstacionamento;
import com.eder.modulos.Estac;
import com.eder.services.EstacionamentoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estacionamento")
@RequiredArgsConstructor
public class ControlerEstacionamento {


    private final EstacionamentoServices estacionamentoServices;
private MapperEstacionamento mapperEstacionamento;
    @PostMapping
    public ResponseEntity<Estac> criar(@RequestBody Estac estac) {
        Estac estac1 = estacionamentoServices.criar(estac);

        return ResponseEntity.created(null).body(estac1);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Estac> atualizar(@RequestBody Estac estac, @PathVariable Long id) {
        Estac estac1 = estacionamentoServices.atualizar(estac, id);

        return ResponseEntity.ok(estac);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        estacionamentoServices.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estac> obter(@PathVariable Long id) {
        Estac estac = estacionamentoServices.obter(id);

        return ResponseEntity.ok(estac);
    }

    @GetMapping
    public ResponseEntity<List<Estac>> listar() {
        List<Estac> listar = estacionamentoServices.listar();
        return ResponseEntity.ok(listar);

    }
}
