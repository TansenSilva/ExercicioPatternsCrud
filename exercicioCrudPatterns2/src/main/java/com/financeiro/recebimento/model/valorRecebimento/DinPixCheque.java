package com.financeiro.recebimento.model.valorRecebimento;

import com.financeiro.recebimento.model.RecebimentosModel;

import java.math.BigDecimal;

public class DinPixCheque implements CalculoRecebimento {
    @Override
    public BigDecimal calculoPagamento(RecebimentosModel recebimentosModel) {
        return recebimentosModel.getValorAReceber();
    }
}
