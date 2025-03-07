package com.dio.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dev {
    private String nome;
    private List<ConteudoEducaional> conteudosInscritos = new ArrayList<>();
    private List<ConteudoEducaional> conteudosConcluidos= new ArrayList<>();

    public void inscrever(ConteudoEducaional conteudo){
        if (conteudosInscritos.contains(conteudo)){
            System.out.println("Já inscrito no conteúdo");
        }else{
            conteudosInscritos.add(conteudo);
        }

    }

    public void inscrever(Bootcamp bootcamp){
        for(ConteudoEducaional conteudo : bootcamp.getConteudoEducaionals()){
            inscrever(bootcamp);
        }
        bootcamp.getDevs().add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void progradir(){
        Optional<ConteudoEducaional> conteudo = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            conteudosInscritos.add(conteudo.get());
            conteudosInscritos.remove(conteudo);
        } else{
            System.out.println("Você não esta mais inscrito em nenhum conteudo");
        }
    }

    public double calcularXp(){
        return conteudosConcluidos.stream().
                mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

}
