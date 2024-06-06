package com.seubanco.banco_digital.repository;

import com.seubanco.banco_digital.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}