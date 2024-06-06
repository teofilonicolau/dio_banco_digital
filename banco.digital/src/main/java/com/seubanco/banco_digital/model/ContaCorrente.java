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
public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;


    public boolean usarChequeEspecial(double valor) {
        if (valor <= limiteChequeEspecial) {
            limiteChequeEspecial -= valor;
            double saldoAtual = getSaldo();
            saldoAtual -= valor;
            setSaldo(saldoAtual);
            return true;
        }
        return false;
    }
}
