package com.eder.control;

import com.eder.dtos.DtosVeiculo;
import com.eder.modulos.Veiculo;
import com.eder.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/veiculo")
@RequiredArgsConstructor
public class ControlerVeiculo extends DtosVeiculo {

    private final VeiculoService veiculoService;
    private DtosVeiculo dtosVeiculo;

    @PostMapping
    public ResponseEntity<DtosVeiculo> criar(@RequestBody DtosVeiculo dtosVeiculo){ // dtos

        DtosVeiculo dtosVeiculo1 = veiculoService.criar(dtosVeiculo);

        return ResponseEntity.created(null).body(dtosVeiculo1);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@RequestBody @Valid DtosVeiculo dtosveiculo, @PathVariable Long id) {
         Veiculo veiculo1 = veiculoService.atualizar(dtosveiculo, id);

        return ResponseEntity.ok().body(veiculo1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {

        veiculoService.deletar(id);

        return ResponseEntity.noContent().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> obter(@PathVariable Long id) {

        Veiculo veiculo = veiculoService.obter(id);

        return ResponseEntity.ok(veiculo);
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> listar() {

       List<Veiculo> listar = veiculoService.listar();

        return ResponseEntity.ok(listar);
    }
}
