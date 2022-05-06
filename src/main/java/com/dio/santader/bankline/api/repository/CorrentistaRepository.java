package com.dio.santader.bankline.api.repository;

import com.dio.santader.bankline.api.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository <Correntista,Integer> {
}
