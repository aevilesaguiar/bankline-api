package com.dio.santader.bankline.api.controller;

import com.dio.santader.bankline.api.dto.NovoCorrentista;
import com.dio.santader.bankline.api.model.Correntista;
import com.dio.santader.bankline.api.repository.CorrentistaRepository;
import com.dio.santader.bankline.api.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas") //todas as rotas que forem mencionadas a correntistas ela vai tentar fazer operações relacionadas ao Banco de dados
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    @Autowired
    private CorrentistaService correntistaService;


    @GetMapping //você é uma requisição do tipo get para ser chamada através do endpoint "/correntistas" para trazer nossos dados do banco
    public List<Correntista> findAll(){
        return correntistaRepository.findAll();
    }

    @PostMapping //recebe o correntista
    public  void save(@RequestBody NovoCorrentista correntista){
        correntistaService.save(correntista);
    }



}
