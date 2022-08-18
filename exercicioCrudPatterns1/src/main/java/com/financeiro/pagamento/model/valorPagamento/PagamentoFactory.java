package com.financeiro.pagamento.model.valorPagamento;

public class PagamentoFactory {

    public CalculoPagamento calculoPagamento(String tipoDePagamento){

        if (tipoDePagamento.equalsIgnoreCase("PAGAMENTO_ATRASADO")){
            return new PagamentoAtrasado();
        } else if (tipoDePagamento.equalsIgnoreCase("PAGAMENTO_EM_DIA")) {
            return new PagamentoEmDia();
        }
        return null;
    }

}
