package com.diobank.entities.contas;

import com.diobank.entities.Cliente;
import com.diobank.interfaces.ContaInterface;

public abstract class Conta implements ContaInterface {

    private static final int AGENCIA_PADRAO = 1997;
    private static Integer SEQUENCIAL = 1;

    protected Integer agencia;
    protected Integer conta;
    protected Double saldo = 0.0;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
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
        this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public String imprimirEstrato() {
        return "\nConta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }
}
