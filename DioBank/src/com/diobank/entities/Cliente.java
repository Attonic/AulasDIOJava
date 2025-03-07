package com.diobank.entities;

public class Cliente {
    private String name;
    private String cpfCnpj;

    public Cliente(String name, String cpfCnpj) {
        this.name = name;
        this.cpfCnpj = cpfCnpj;
    }

    public String getName() {
        return name;
    }


    public String getCpfCnpj() {
        return cpfCnpj;
    }


}
