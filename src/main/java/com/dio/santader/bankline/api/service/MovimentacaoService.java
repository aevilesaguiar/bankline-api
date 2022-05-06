package com.dio.santader.bankline.api.service;

import com.dio.santader.bankline.api.dto.NovaMovimentacao;
import com.dio.santader.bankline.api.model.Correntista;
import com.dio.santader.bankline.api.model.Movimentacao;
import com.dio.santader.bankline.api.model.MovimentacaoTipo;
import com.dio.santader.bankline.api.repository.CorrentistaRepository;
import com.dio.santader.bankline.api.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Autowired
    private CorrentistaRepository correntistaRepository;


    public void save (NovaMovimentacao novaMovimentacao){

        Movimentacao movimentacao= new Movimentacao();

        //Double valor = novaMovimentacao.getTipo()== MovimentacaoTipo.RECEITA ? novaMovimentacao.getValor(): novaMovimentacao.getValor()* -1;

        Double valor = novaMovimentacao.getValor();
        if(novaMovimentacao.getTipo()==MovimentacaoTipo.DESPESA){
            valor=valor*-1;}

        movimentacao.setDate(LocalDateTime.now());//a data de agora
        movimentacao.setId(novaMovimentacao.getIdConta());
        movimentacao.setDescricao(novaMovimentacao.getDescricao());
        movimentacao.setTipo(novaMovimentacao.getTipo());
        movimentacao.setValor(valor);

        Correntista correntista=correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);//se achou com id ok, senão null
        if(correntista !=null){
            correntista.getConta().setSaldo(correntista.getConta().getSaldo()+valor);
            correntistaRepository.save(correntista);
        }

        movimentacaoRepository.save(movimentacao);
    }

}
