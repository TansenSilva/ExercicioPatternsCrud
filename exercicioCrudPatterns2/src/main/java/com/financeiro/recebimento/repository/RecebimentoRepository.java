package com.financeiro.recebimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.financeiro.recebimento.model.RecebimentosModel;

@Repository
public interface RecebimentoRepository extends JpaRepository<RecebimentosModel, Long> {
}
