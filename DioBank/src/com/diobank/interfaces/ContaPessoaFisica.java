package com.diobank.interfaces;

import com.diobank.entities.Conta;

public interface ContaPessoaFisica {

    void sacar(Double valor);
    void depositar(Double valor);
    void transferir(Double valor, Conta contaDestino);


}
