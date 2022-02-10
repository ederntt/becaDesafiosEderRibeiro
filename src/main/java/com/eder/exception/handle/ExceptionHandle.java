package com.eder.exception.handle;

import com.eder.exception.TratamentoErros;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(TratamentoErros.class)
    public ResponseEntity<Padrao> Erro(TratamentoErros t) {
        Padrao padrao = new Padrao();
        padrao.setMensagem(t.getMessage());
        padrao.setCodigo(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(padrao.getCodigo()).body(padrao);

    }
}
