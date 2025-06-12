package model;

import java.util.ArrayList;
import java.util.List;

public class Participante {
    private String nome;
    private String curso;
    private List<Evento> eventosInscritos;

    public Participante(String nome, String cpf, String email, String curso) {
        this.nome = nome;
        this.curso = curso;
        this.eventosInscritos = new ArrayList<>(); // NOVO
    }

    public void addEvento(Evento evento) {
        this.eventosInscritos.add(evento);
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public List<Evento> getEventosInscritos() {
        return eventosInscritos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEventosInscritos(List<Evento> eventosInscritos) {
        this.eventosInscritos = eventosInscritos;
    }
}

