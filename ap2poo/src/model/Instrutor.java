package model;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends PessoaResponsavel {
    private String formacao;
    private List<Minicurso> minicursosMinistrados;

    public Instrutor(String nome, String email, String formacao, String areaEspecializacao) {
        super(nome, email);
        this.formacao = formacao;
        this.minicursosMinistrados = new ArrayList<>();
    }

    public void addMinicurso(Minicurso minicurso) {
        this.minicursosMinistrados.add(minicurso);
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setMinicursosMinistrados(List<Minicurso> minicursosMinistrados) {
        this.minicursosMinistrados = minicursosMinistrados;
    }

    public List<Minicurso> getMinicursosMinistrados() {
        return minicursosMinistrados; }
}
