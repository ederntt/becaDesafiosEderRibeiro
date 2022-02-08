package com.eder.control;

import com.eder.dtos.DtosVeiculo;
import com.eder.modulos.Veiculo;
import com.eder.nterface.InterfaceVeiculo;
import com.eder.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
@RequiredArgsConstructor
public class ControlerVeiculo {

    private final VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<Veiculo> criar(@RequestBody Veiculo veiculo){

        Veiculo veiculo1 = veiculoService.criar(veiculo);

        return ResponseEntity.created(null).body(veiculo1);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@RequestBody Veiculo veiculo, @PathVariable Long id) {
         Veiculo veiculo1 = veiculoService.atualizar(veiculo, id);

        return ResponseEntity.ok().body(veiculo1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {

        veiculoService.deletar(id);

        return ResponseEntity.noContent().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<DtosVeiculo> obter(@PathVariable Long id) {

        Veiculo veiculo1 = veiculoService.obter(id);

        return ResponseEntity.ok(veiculo1);
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> listar() {

       List<Veiculo> listar = veiculoService.listar();

        return ResponseEntity.ok(listar);
    }
}
