package com.seubanco.banco_digital.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContaPoupanca extends Conta {
    private double rendimento;


    public void aplicarRendimento() {
        double saldoAtual = getSaldo();
        saldoAtual += saldoAtual * rendimento;
        setSaldo(saldoAtual);
    }
}