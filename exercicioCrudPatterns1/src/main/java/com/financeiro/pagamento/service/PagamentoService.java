package com.financeiro.pagamento.service;

import com.financeiro.pagamento.model.PagamentoModel;
import com.financeiro.pagamento.model.valorPagamento.PagamentoFactory;
import com.financeiro.pagamento.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;


    public List<PagamentoModel> buscarTodos(){
        return pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> buscarId(Long codigo){
        return pagamentoRepository.findById(codigo);
    }

    public PagamentoModel cadastrar(PagamentoModel pagamentoModel){
        PagamentoFactory factory = new PagamentoFactory();
        BigDecimal valor = factory.calculoPagamento(pagamentoModel.getStatus()).calculoPagamento(pagamentoModel);
        pagamentoModel.getIdPagamento();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaValor();
        pagamentoModel.setValorPago(valor);

        return pagamentoRepository.save(pagamentoModel);
    }

    public PagamentoModel alterar(PagamentoModel pagamentoModel){

        PagamentoFactory factory = new PagamentoFactory();
        BigDecimal valor = factory.calculoPagamento(pagamentoModel.getStatus()).calculoPagamento(pagamentoModel);
        pagamentoModel.getIdPagamento();
        pagamentoModel.getValorAPagar();
        pagamentoModel.getDiferencaValor();
        pagamentoModel.setValorPago(valor);

        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletar(Long codigo){
        pagamentoRepository.deleteById(codigo);
    }




}
