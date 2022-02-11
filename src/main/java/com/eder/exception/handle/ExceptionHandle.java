package com.eder.exception.handle;

import com.eder.exception.TratamentoErros;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(TratamentoErros.class)
    public ResponseEntity<Padrao> Erro(TratamentoErros t) {
        Padrao padrao = new Padrao();
        padrao.setMensagem(t.getMessage());
        padrao.setCodigo(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(padrao.getCodigo()).body(padrao);
    }
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Padrao> Erro(HttpRequestMethodNotSupportedException t) {
        Padrao padrao = new Padrao();
        padrao.setMensagem("Não sera possivel deletar estacionamento sem id");
        padrao.setCodigo(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(padrao.getCodigo()).body(padrao);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Padrao> Erro(MethodArgumentNotValidException t) {
        Padrao padrao = new Padrao();
        padrao.setMensagem("revise o codigo");
        padrao.setCodigo(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(padrao.getCodigo()).body(padrao);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Padrao> Erro(HttpMessageNotReadableException t) {
        Padrao padrao = new Padrao();
        padrao.setMensagem("revise o codigo");
        padrao.setCodigo(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(padrao.getCodigo()).body(padrao);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Padrao> Erro(NoSuchElementException t) {
        Padrao padrao = new Padrao();
        padrao.setMensagem("O Veiculo no qual você buscou é invalido");
        padrao.setCodigo(HttpStatus.NOT_ACCEPTABLE.value());

        return ResponseEntity.status(padrao.getCodigo()).body(padrao);
    }
}
