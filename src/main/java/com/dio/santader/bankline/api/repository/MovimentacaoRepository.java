package com.dio.santader.bankline.api.repository;

import com.dio.santader.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao,Integer > {
}
