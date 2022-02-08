package com.eder.modulos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Estac {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome = "Gran Parking";
    private String telefone = "(41) 4002-8922";
    private Double faturamentoGeral;
    private String data;


    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "estac")
    @JsonIgnore
    private List<Veiculo> veiculos;

}

