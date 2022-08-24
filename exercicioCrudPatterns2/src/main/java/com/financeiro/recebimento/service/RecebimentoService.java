package com.financeiro.recebimento.service;

import com.financeiro.recebimento.model.valorRecebimento.RecebimentoFactory;
import com.financeiro.recebimento.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.financeiro.recebimento.model.RecebimentosModel;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {

    @Autowired
    private RecebimentoRepository recebimentoRepository;


    public List<RecebimentosModel> buscarTodos(){
        return recebimentoRepository.findAll();
    }

    public Optional<RecebimentosModel> buscarId(Long codigo){
        return recebimentoRepository.findById(codigo);
    }

    public List<RecebimentosModel> findByRecebimentos (String formaDeRecebimento){
        return recebimentoRepository.findByFormaDeRecebimento(formaDeRecebimento);
    }

    public RecebimentosModel cadastrar(RecebimentosModel recebimentosModel){
        RecebimentoFactory factory = new RecebimentoFactory();
        BigDecimal valor = factory.calculoPagamento(recebimentosModel.getFormaDeRecebimento()).calculoPagamento(recebimentosModel);
        BigDecimal desconto = recebimentosModel.getValorAReceber().subtract(valor);
        recebimentosModel.getIdRecebimento();
        recebimentosModel.getValorAReceber();
        recebimentosModel.setDescontoRecebimento(desconto);
        recebimentosModel.setValorRecebido(valor);

        return recebimentoRepository.save(recebimentosModel);
    }

    public RecebimentosModel alterar(RecebimentosModel recebimentosModel){
        RecebimentoFactory factory = new RecebimentoFactory();
        BigDecimal valor = factory.calculoPagamento(recebimentosModel.getFormaDeRecebimento()).calculoPagamento(recebimentosModel);
        BigDecimal desconto = recebimentosModel.getValorAReceber().subtract(valor);
        recebimentosModel.getIdRecebimento();
        recebimentosModel.getValorAReceber();
        recebimentosModel.setDescontoRecebimento(desconto);
        recebimentosModel.setValorRecebido(valor);

        return recebimentoRepository.save(recebimentosModel);
    }

    public void deletar(Long codigo){
        recebimentoRepository.deleteById(codigo);
    }

}
