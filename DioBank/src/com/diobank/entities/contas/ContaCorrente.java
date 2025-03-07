package com.diobank.entities.contas;

import com.diobank.entities.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String imprimirEstrato() {
        return "==== Extrato Conta Corrente =====" +
                super.imprimirEstrato();

    }
}