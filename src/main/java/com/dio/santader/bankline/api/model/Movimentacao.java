package com.dio.santader.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movimentacao {
    private Integer id;
    private LocalDateTime date;
    private String descricao;
    private Double valor;

    private MovimentacaoTipo tipo;

}
