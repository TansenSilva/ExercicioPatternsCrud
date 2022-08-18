package com.financeiro.recebimento.model.valorRecebimento;

import com.financeiro.recebimento.model.RecebimentosModel;

import java.math.BigDecimal;

public interface CalculoRecebimento {

    public BigDecimal calculoPagamento(RecebimentosModel pagamentoModel);
}
