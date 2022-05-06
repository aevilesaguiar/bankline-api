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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_hora")
    private LocalDateTime date;

    @Column
    private String descricao;

    @Column
    private Double valor;

    @Enumerated(EnumType.STRING)//dizemos que vamos salvar o proprio valor literal ou DESPESA OU RECEITA
    private MovimentacaoTipo tipo;

}
