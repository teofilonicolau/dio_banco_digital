package com.seubanco.banco_digital.repository;

import com.seubanco.banco_digital.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}