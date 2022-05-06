package com.dio.santader.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private LocalDateTime date;
    @Column
    private String descricao;

    @Column
    private Double valor;

    private MovimentacaoTipo tipo;

}
