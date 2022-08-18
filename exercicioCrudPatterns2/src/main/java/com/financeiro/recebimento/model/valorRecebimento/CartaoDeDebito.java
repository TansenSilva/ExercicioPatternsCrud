package com.financeiro.recebimento.model.valorRecebimento;

import com.financeiro.recebimento.model.RecebimentosModel;

import java.math.BigDecimal;

public class CartaoDeDebito implements CalculoRecebimento {
    @Override
    public BigDecimal calculoPagamento(RecebimentosModel recebimentosModel) {
      return   recebimentosModel.getValorAReceber().subtract(recebimentosModel.getValorAReceber().multiply(new BigDecimal("0.025")));
    }
}
