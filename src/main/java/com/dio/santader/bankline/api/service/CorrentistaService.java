package com.dio.santader.bankline.api.service;

import com.dio.santader.bankline.api.dto.NovoCorrentista;
import com.dio.santader.bankline.api.model.Conta;
import com.dio.santader.bankline.api.model.Correntista;

import com.dio.santader.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CorrentistaService {

    @Autowired
    private CorrentistaRepository correntistaRepository; //faz a persistencia dos dados

    public void save(NovoCorrentista novoCorrentista){

        Correntista correntista = new Correntista();
        correntista.setNome(novoCorrentista.getNome());
        correntista.setCpf(novoCorrentista.getCpf());

        //criamos uma conta a cada novo correntista
        Conta conta = new Conta();

        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());
        correntista.setConta(conta);
        correntistaRepository.save(correntista);
    }
}
