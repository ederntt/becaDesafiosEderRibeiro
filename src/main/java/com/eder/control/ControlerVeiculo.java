package com.eder.control;

import com.eder.modulos.Veiculo;
import com.eder.dtos.request.VeiculoRequest;
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
    public ResponseEntity<Veiculo> criar(@RequestBody Veiculo veiculoRequest){
        Veiculo veiculoResponse = veiculoServices.criar(veiculoRequest);

        return ResponseEntity.created(null).body(veiculoRequest);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@RequestBody Veiculo veiculo, @PathVariable Long id) {
         Veiculo veiculoAtualizar = veiculoServices.atualizar(veiculo, id);

        return ResponseEntity.ok().body(veiculoAtualizar);
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
