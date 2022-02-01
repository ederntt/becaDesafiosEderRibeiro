package com.eder.control;

import com.eder.Modulos.Estac;
import com.eder.Modulos.Veiculo;
import com.eder.services.EstacionamentoServices;
import com.eder.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class ControlerVeiculo {

    @Autowired
    private VeiculoService veiculoServices;

    @PostMapping
    public ResponseEntity<Veiculo> criar(@RequestBody Veiculo veiculo) {
        Veiculo veiculoCriado = veiculoServices.criar(veiculo);
        return ResponseEntity.created(null).body(veiculoCriado);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@RequestBody Veiculo veiculo, @PathVariable Long id) {
        Veiculo veiculoAtualizar = veiculoServices.atualizar(veiculo, id);

        return ResponseEntity.ok(veiculoAtualizar);
    }

    @RequestMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {

        veiculoServices.deletar(id);

        return ResponseEntity.noContent().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> obter(@PathVariable Long id) {

        Veiculo veiculoObter = veiculoServices.obter(id);

        return ResponseEntity.ok(veiculoObter);
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> listar() {

       List<Veiculo> listar = veiculoServices.listar();

        return ResponseEntity.ok(listar);
    }
}
