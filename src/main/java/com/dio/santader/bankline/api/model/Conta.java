package com.dio.santader.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable // @Embeddable é usada para especificar tipos incorporáveis. Como os tipos básicos, os tipos incorporáveis não tem identidade, sendo gerenciados por sua entidade proprietária.
@Table(name = "conta")
public class Conta {

    @Column(name = "conta_numero")
    private Long numero;

    @Column(name = "conta_saldo")
    private Double saldo;
}
