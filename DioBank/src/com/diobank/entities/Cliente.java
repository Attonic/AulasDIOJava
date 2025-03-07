package com.diobank.entities;

import java.time.LocalDate;

public class Cliente {
    private String name;
    private String cpfCnpj;
    private LocalDate nascimento;


    public Cliente(String name, String cpfCnpj, LocalDate nascimento) {
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.nascimento = nascimento;
    }

    public String getName() {
        return name;
    }


    public String getCpfCnpj() {
        return cpfCnpj;
    }


}
