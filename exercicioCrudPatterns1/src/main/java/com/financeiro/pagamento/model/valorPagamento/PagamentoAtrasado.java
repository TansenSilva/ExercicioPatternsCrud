package com.financeiro.pagamento.model.valorPagamento;

import com.financeiro.pagamento.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoAtrasado implements CalculoPagamento{
    @Override
    public BigDecimal calculoPagamento(PagamentoModel pagamentoModel) {
      return   pagamentoModel.getValorAPagar().add(pagamentoModel.getDiferencaValor());
    }
}
