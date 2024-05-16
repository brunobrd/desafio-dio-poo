package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("br.com.dio.desafio.dominio.Curso Java");
        curso1.setDescricao("Projeto DIO");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("bootcamp de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devbruno = new Dev();
        devbruno.setNome("Bruno");
        devbruno.inscreverBootcamp(bootcamp);
        devbruno.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos" + devbruno.getConteudosInscritos());
        System.out.println("Conteudos Inscritos" + devbruno.getConteudosConcluidos());
    }
}