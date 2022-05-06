package com.dio.santader.bankline.api.controller;

import com.dio.santader.bankline.api.dto.NovaMovimentacao;
import com.dio.santader.bankline.api.model.Movimentacao;
import com.dio.santader.bankline.api.repository.MovimentacaoRepository;
import com.dio.santader.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes") //recursos
public class MovimentacaoController {

    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    MovimentacaoService movimentacaoservice;

    @GetMapping
    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao novaMovimentacao){
        movimentacaoservice.save(novaMovimentacao);
    }




}
