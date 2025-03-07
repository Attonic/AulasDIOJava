package com.diobank.application;

import com.diobank.entities.contas.Conta;
import com.diobank.entities.contas.ContaCorrente;
import com.diobank.entities.contas.ContaPoupanca;

public class Program {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta pp = new ContaPoupanca();

        pp.depositar(200.00);
        System.out.println(pp.imprimirEstrato());
        pp.transferir(100.00, cc);

        System.out.println(cc.imprimirEstrato());
        System.out.println(pp.imprimirEstrato());

    }
}
