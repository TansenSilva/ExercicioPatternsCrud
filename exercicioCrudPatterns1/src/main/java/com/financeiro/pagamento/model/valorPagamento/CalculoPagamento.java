package com.financeiro.pagamento.model.valorPagamento;

import com.financeiro.pagamento.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoPagamento {

    public BigDecimal calculoPagamento(PagamentoModel pagamentoModel);
}
