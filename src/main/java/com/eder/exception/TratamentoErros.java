package com.eder.exception;

public class TratamentoErros extends RuntimeException{
    public TratamentoErros() {
        super();
    }

    public TratamentoErros(String message) {
        super(message);


    }
}
