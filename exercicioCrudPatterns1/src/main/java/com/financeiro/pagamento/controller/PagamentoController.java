package com.financeiro.pagamento.controller;

import com.financeiro.pagamento.model.PagamentoModel;
import com.financeiro.pagamento.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping(path = "/pagamento")
    public List<PagamentoModel> buscaTodosPagamentos(){
        return pagamentoService.buscarTodos();
    }

    @GetMapping(path = "/pagamento/{codigo}")
    public Optional<PagamentoModel> buscaPagamentoPorId(@PathVariable Long codigo){
        return pagamentoService.buscarId(codigo);
    }

    @PostMapping(path = "/pagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel cadastrarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return pagamentoService.cadastrar(pagamentoModel);
    }

    @PutMapping(path = "/pagamento/{codigo}")
    public PagamentoModel alterarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return pagamentoService.alterar(pagamentoModel);
    }

    @DeleteMapping(path = "/pagamento/{codigo}")
    public void deletarPagamento(@PathVariable Long codigo){
        pagamentoService.deletar(codigo);
    }
}
