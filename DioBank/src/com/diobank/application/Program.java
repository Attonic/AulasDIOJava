package com.diobank.application;



import com.diobank.entities.Bank;
import com.diobank.entities.Cliente;
import com.diobank.entities.contas.Conta;
import com.diobank.entities.contas.ContaCorrente;
import com.diobank.entities.contas.ContaPoupanca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Bank banco = new Bank();

        System.out.println("Preencha os dados: ");

        System.out.println("Quantas contas você vai cadastrar? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            System.out.println("---- Cadastro de Cliente ----");
            sc.nextLine();

            System.out.println("Nome do Cliente: ");
            String nome = sc.nextLine();

            System.out.println("Digite CPF ou CNPJ: ");
            String cpfCnpj = sc.nextLine();

            System.out.println("Digite a Data de Nascimento: ");
            LocalDate date = LocalDate.parse(sc.next(), dtf);

            Cliente cliente = new Cliente(nome, cpfCnpj, date);

            System.out.println("Qual tipo de conta vai ser cadastrada: ");
            System.out.println("Poupança - 1, Conta Corrente - 2");
            int op = sc.nextInt();

            Conta conta;
            if (op == 1){
                 conta = new ContaPoupanca(cliente);

            }else if (op == 2){
                 conta = new ContaCorrente(cliente);
            }else {
                System.out.println("Opção invalida");
                continue;
            }

            banco.adicionarConta(conta, cliente);
            System.out.println("Conta adicionada!");
        }


        System.out.println("Clientes Cadastrados: ");
        banco.listarClientes();



        sc.close();

    }
}
