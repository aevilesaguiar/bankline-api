package com.dio.santader.bankline.api.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Correntista {

    private Integer id;
    private String cpf;
    private String nome;
    private Conta conta;



}
