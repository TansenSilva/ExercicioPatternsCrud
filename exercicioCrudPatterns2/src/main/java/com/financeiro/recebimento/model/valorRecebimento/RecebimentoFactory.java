package com.financeiro.recebimento.model.valorRecebimento;

public class RecebimentoFactory {

    public CalculoRecebimento calculoPagamento(String tipoDePagamento){

        if (tipoDePagamento.equalsIgnoreCase("CARTAO_DE_DEBITO")){
            return new CartaoDeDebito();
        } else if (tipoDePagamento.equalsIgnoreCase("DIN_PIX_CHEQUE")) {
            return new DinPixCheque();
        }else if (tipoDePagamento.equalsIgnoreCase("CARTAO_DE_CREDITO")) {
            return new CartaoDeCredito();
        }else if (tipoDePagamento.equalsIgnoreCase("VALE_REFEICAO")) {
            return new ValeRefeicao();
        }
        return null;
    }

}
