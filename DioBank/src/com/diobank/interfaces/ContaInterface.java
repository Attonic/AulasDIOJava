package com.diobank.interfaces;

import com.diobank.entities.contas.Conta;

public interface ContaInterface {

    void sacar(Double valor);
    void depositar(Double valor);
    void transferir(Double valor, Conta contaDestino);


}
