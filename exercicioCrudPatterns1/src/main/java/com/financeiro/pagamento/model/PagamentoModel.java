package com.financeiro.pagamento.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "registros_de_pagamento")
public class PagamentoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPagamento;

    @Column(length = 50, nullable = false)
    private String status;

    @Column(name = "valor_a_pagar",length = 50, nullable = false)
    private BigDecimal valorAPagar;

    @Column(name = "diferença_de_valor",length = 10, nullable = false)
    private BigDecimal diferencaValor;

    @Column(name = "valor_pago",length = 10, nullable = false)
    private BigDecimal valorPago;

}
