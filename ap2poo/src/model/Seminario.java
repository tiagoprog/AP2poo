package model;

import java.time.LocalDate;

public class Seminario extends Evento {
    private String tema;
    private String nomeAlunoApresentador;
    private String nomeOrientador;

    public Seminario(String titulo, LocalDate data, Local local, String tema, String nomeAlunoApresentador) {
        super(titulo, data, local);
        this.tema = tema;
        this.nomeAlunoApresentador = nomeAlunoApresentador;
    }

    public String getTema() {
        return tema;
    }

    public String getNomeAlunoApresentador() {
        return nomeAlunoApresentador;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setNomeAlunoApresentador(String nomeAlunoApresentador) {
        this.nomeAlunoApresentador = nomeAlunoApresentador;
    }

    public String getNomeOrientador() {
        return nomeOrientador;
    }

    public void setNomeOrientador(String nomeOrientador) {
        this.nomeOrientador = nomeOrientador;
    }
}
