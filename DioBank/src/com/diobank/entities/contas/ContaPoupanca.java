package com.diobank.entities.contas;

import com.diobank.entities.Cliente;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String imprimirEstrato() {
        return "==== Extrato Conta Corrente =====" +
                super.imprimirEstrato();

    }
}
