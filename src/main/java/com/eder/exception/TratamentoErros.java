package com.eder.exception;

public class TratamentoErros extends RuntimeException {
    public TratamentoErros(String message) {
        super(message);
    }

    public TratamentoErros() {
        super();
    }
}
