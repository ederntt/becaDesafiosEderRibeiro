package com.eder.exception.handle;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Padrao {

    private Integer codigo;
    private String mensagem;
    private LocalDateTime dataH;
}


