package com.eder.control;

import com.eder.dtos.DtosVeiculo;
import com.eder.mappers.MapperVeiculo;
import com.eder.modulos.Veiculo;
import com.eder.nterface.InterfaceVeiculo;
import com.eder.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/veiculo")
public class ControlerVeiculo {

    private InterfaceVeiculo veiculoServices;
    private final VeiculoService veiculoService;
    private MapperVeiculo mapperVeiculo;

    @PostMapping
    public ResponseEntity<Veiculo> criar(@RequestBody Veiculo veiculo){

        Veiculo veiculo1 = veiculoServices.criar(veiculo);

        return ResponseEntity.created(null).body(veiculo1);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@RequestBody Veiculo veiculo, @PathVariable Long id) {
         Veiculo dtoVeiculo = veiculoServices.atualizar(veiculo, id);

        return ResponseEntity.ok().body(dtoVeiculo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {

        veiculoServices.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> obter(@PathVariable Long id) {

       Veiculo veiculoObtido = veiculoServices.obter(id);

        return ResponseEntity.ok(veiculoObtido);
    }

    @GetMapping
    public ResponseEntity<List<DtosVeiculo>> listar() {

       List<Veiculo> listar1 = veiculoServices.listar();

        return ResponseEntity.ok(mapperVeiculo.veiculoToDtoVeiculo(listar1));
    }
}
