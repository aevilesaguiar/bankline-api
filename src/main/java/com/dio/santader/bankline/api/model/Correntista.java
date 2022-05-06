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
@Entity
@Table(name = "tab_correntista")
public class Correntista {

    @Id //jpa essa coluna é a chave primária(identificador exclusivo do registro)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //jpa essa classe correntista tem uma chave primaria e você vai gerenciar ela através do postgres
    private Integer id;
    @Column(name = "cpf", length = 20)
    private String cpf;

    @Column(name = "nome", length = 60)
    private String nome;

    @Embedded //@Embedded é usada para especificar que um determinado atributo de entidade representa um tipo incorporável.As informações que estiverem na classe Conta estarão na mesma tabela que a principal
    private Conta conta;



}
