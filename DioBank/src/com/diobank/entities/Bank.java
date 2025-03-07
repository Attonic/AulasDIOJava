package com.diobank.entities;

import com.diobank.entities.contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Bank() {
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Cliente> getClientes(){
        return  clientes;
    }

    public void adicionarConta(Conta conta, Cliente cliente){
        contas.add(conta);
        if (!clientes.contains(cliente)){
            clientes.add(cliente);
        }
        System.out.println("Cliente adicionado: " + cliente.getName());
    }

    public void listarClientes(){
        if(clientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado");
            return;
        }
        System.out.println("Lista de Clientes Cadastrados: ");
        for (Cliente cliente : clientes){
            System.out.println("Nome: " + cliente.getName() + " == CPF/CNPJ: " + cliente.getCpfCnpj());
        }
    }
}
