package control;

import model.Instrutor;
import model.Minicurso;
import model.Participante;
import model.Sala;

import java.time.LocalDate;
import java.util.Collections;

public class Programa {

    public static void main(String[] args) {


        Sala sala302 = new Sala("Sala 302", 30, "Bloco A", 302, true);
        Sala sala305 = new Sala("Sala 305", 25, "Bloco B", 305, false);

        Instrutor profCarlos = new Instrutor("Tiago Macedo", "tiago@ibmec.edu", "Doutorado", "IA");
        Instrutor profAna = new Instrutor("Ana Souza", "ana@email.com", "Mestrado", "Banco de Dados");

        Participante joaoSilva = new Participante("João Silva", "111.222.333-44", "joao@email.com", "Ciência da Computação");
        Participante juliaLima = new Participante("Julia Lima", "999.888.777-66", "julia@email.com", "Sistemas de Informação");
        Participante mariaOliveira = new Participante("Maria Oliveira", "555.444.333-22", "maria@email.com", "Engenharia de Software");

        Minicurso minicursoJava = new Minicurso("Java Avançado", LocalDate.of(2025, 9, 10), sala302, Collections.singletonList(profCarlos));
        Minicurso minicursoBD = new Minicurso("Banco de Dados", LocalDate.of(2025, 9, 11), sala305, Collections.singletonList(profAna));

        minicursoJava.inscreverParticipante(joaoSilva);
        minicursoJava.inscreverParticipante(juliaLima);
    }
}
