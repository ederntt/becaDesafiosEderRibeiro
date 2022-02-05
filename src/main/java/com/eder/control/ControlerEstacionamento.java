package com.eder.control;

import com.eder.dtos.request.EstacionamentoRequest;
import com.eder.dtos.responses.EstacResponse;
import com.eder.modulos.Estac;
import com.eder.services.EstacionamentoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estacionamento")
@RequiredArgsConstructor
public class ControlerEstacionamento {


    private final EstacionamentoServices estacionamentoServices;

    @PostMapping
    public ResponseEntity<EstacResponse> criar(@RequestBody EstacionamentoRequest estacionamentoRequest) {
        EstacResponse estacResponse = estacionamentoServices.criar(estacionamentoRequest);

        return ResponseEntity.created(null).body(estacResponse);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<EstacResponse> atualizar(@RequestBody EstacionamentoRequest estacionamentoRequest, @PathVariable Long id) {
        EstacResponse estacResponse = estacionamentoServices.atualizar(estacionamentoRequest, id);

        return ResponseEntity.ok(estacResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        estacionamentoServices.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstacResponse> obter(@PathVariable Long id) {
        EstacResponse estacResponse = estacionamentoServices.obter(3L);

        return ResponseEntity.ok(estacResponse);
    }

    @GetMapping
    public ResponseEntity<List<EstacResponse>> listar() {
        List<EstacResponse> listar = estacionamentoServices.listar();
        return ResponseEntity.ok(listar);

    }


}
