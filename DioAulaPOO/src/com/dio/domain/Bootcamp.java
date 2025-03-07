package com.dio.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bootcamp {
    private String nome;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private List<ConteudoEducaional> conteudoEducaionals = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public List<ConteudoEducaional> getConteudoEducaionals() {
        return conteudoEducaionals;
    }

    public void setConteudoEducaionals(List<ConteudoEducaional> conteudoEducaionals) {
        this.conteudoEducaionals = conteudoEducaionals;
    }
}
