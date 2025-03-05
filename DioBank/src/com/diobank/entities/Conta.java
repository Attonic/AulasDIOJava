package com.diobank.entities;

import com.diobank.interfaces.ContaPessoaFisica;

public abstract class Conta implements ContaPessoaFisica {

    private static final int AGENCIA_PADRAO = 1997;
    private static Integer SEQUENCIAL = 1;

    protected Integer agencia;
    protected Integer conta;
    protected Double saldo;


    public Conta(Integer AGENCIA_PADRAO, Integer conta, Double saldo) {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.saldo = saldo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getConta() {
        return conta;
    }


    public Double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {

    }
}
