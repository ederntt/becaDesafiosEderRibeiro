package com.eder.control;

import com.eder.dtos.DtosEstacionamento;
import com.eder.mappers.MapperEstacionamento;
import com.eder.modulos.Estac;
import com.eder.services.EstacionamentoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/estacionamento")
public class ControlerEstacionamento {

    @Autowired
    private final EstacionamentoServices estacionamentoServices;

    @Autowired
    private MapperEstacionamento mapperEstacionamento;

    @PostMapping
    public ResponseEntity<Estac> criar(@RequestBody Estac estac) {
        Estac estacCriado = estacionamentoServices.criar(estac);

        return ResponseEntity.created(null).body(estacCriado);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Estac> atualizar(@RequestBody Estac estac, @PathVariable Long id) {
        Estac estac1 = estacionamentoServices.atualizar(estac, id);

        return ResponseEntity.ok(estac1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        estacionamentoServices.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estac> obter(@PathVariable Long id) {
        Estac estac1 = estacionamentoServices.obter(id);

        return ResponseEntity.ok(estac1);
    }

    @GetMapping
    public ResponseEntity<List<DtosEstacionamento>> listar() {
        List<Estac> listar = estacionamentoServices.listar();

        return ResponseEntity.ok(mapperEstacionamento.estacToDtoEstac(listar));

    }
}