package com.eder.control;

import com.eder.dtos.request.VeiculoRequest;
import com.eder.dtos.responses.VeiculoResponse;
import com.eder.modulos.Veiculo;
import com.eder.nterface.InterfaceVeiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class ControlerVeiculo {

    @Autowired
    private InterfaceVeiculo veiculoServices;

    @PostMapping
    public ResponseEntity<VeiculoResponse> criar(@RequestBody VeiculoRequest veiculoRequest){

        VeiculoResponse veiculoResponse = veiculoServices.criar(veiculoRequest);

        return ResponseEntity.created(null).body(veiculoResponse);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@RequestBody Veiculo veiculoRequest, @PathVariable Long id) {
         Veiculo veiculoResponse = veiculoServices.atualizar(veiculoRequest, id);

        return ResponseEntity.ok().body(veiculoResponse);
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
    public ResponseEntity<List<Veiculo>> listar() {

       List<Veiculo> listar = veiculoServices.listar();

        return ResponseEntity.ok(listar);
    }
}
