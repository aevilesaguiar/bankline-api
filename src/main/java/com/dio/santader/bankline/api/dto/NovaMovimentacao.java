package com.dio.santader.bankline.api.dto;

import com.dio.santader.bankline.api.model.MovimentacaoTipo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NovaMovimentacao {

    private String descricao;

    private Double valor;

    private MovimentacaoTipo tipo;

    private Integer idConta;
}
