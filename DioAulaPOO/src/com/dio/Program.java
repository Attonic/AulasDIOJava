package com.dio;

import com.dio.domain.*;

import java.sql.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Java Basico");
        cursoJavaBasico.setDescricao("Conceitos básicos sobre Java");
        cursoJavaBasico.setCargaHoraria(8);

        Curso cursoDotNet = new Curso();
        cursoDotNet.setTitulo("C# .NET");
        cursoDotNet.setDescricao("Conceitos sobre C# e .NET");
        cursoDotNet.setCargaHoraria(8);

        Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Java Avançado");
        cursoJavaAvancado.setDescricao("Conceitos avançados sobre Java");
        cursoJavaAvancado.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("Aprendendo POO com java");
        mentoria.setDescricao("Imersão sobre os pilares de POO");
        mentoria.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT START #2 Java");
        bootcamp.setInicio(LocalDateTime.now());
        bootcamp.setFim(LocalDateTime.now().plusDays(40));
        List<ConteudoEducaional> conteudoBootcamp = Arrays.asList(cursoJavaAvancado, cursoJavaBasico, cursoDotNet);
        bootcamp.setConteudoEducaionals(conteudoBootcamp);


        Dev attonic = new Dev();
        attonic.setNome("Attonic");

        Dev cle = new Dev();
        attonic.setNome("Cle");

        attonic.inscrever(cursoJavaAvancado);
        attonic.inscrever(bootcamp);

        cle.inscrever(cursoDotNet);
        cle.inscrever(cursoJavaBasico);

        List<Dev> ranking = Arrays.asList(cle, attonic).stream()
                .sorted((dev1, dev2) -> Double.compare(dev1.calcularXp(), dev2.calcularXp()))
                .collect(Collectors.toList());

        for(Dev dev : ranking){
            System.out.println(dev.getNome());
        }
    }
}
