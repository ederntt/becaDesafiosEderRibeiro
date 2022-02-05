package com.eder.control;

import com.eder.dtos.request.VeiculoRequest;
import com.eder.dtos.responses.VeiculoResponse;
import com.eder.modulos.Veiculo;
import com.eder.nterface.InterfaceVeiculo;
import com.eder.services.VeiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
@RequiredArgsConstructor
public class ControlerVeiculo {


    private InterfaceVeiculo veiculoServices;
    private final VeiculoService veiculoService;

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
    public ResponseEntity<VeiculoResponse> obter(@PathVariable Long id) {

       VeiculoResponse veiculoObtido = veiculoServices.obter(id);

        return ResponseEntity.ok(veiculoObtido);
    }

    @GetMapping
    public ResponseEntity<List<VeiculoResponse>> listar() {

       List<VeiculoResponse> listar = veiculoServices.listar();

        return ResponseEntity.ok(listar);
    }
}
