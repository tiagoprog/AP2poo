package model;

import java.util.ArrayList;
import java.util.List;

public class Palestrante {
    private String nome;
    private String email;
    private String instituicao;
    private List<Palestra> palestrasAgendadas;

    public Palestrante(String nome, String email, String instituicao) {
        this.nome = nome;
        this.email = email;
        this.instituicao = instituicao;
        this.palestrasAgendadas = new ArrayList<>();
    }

    public void addPalestra(Palestra palestra) {
        this.palestrasAgendadas.add(palestra);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public List<Palestra> getPalestrasAgendadas() {
        return palestrasAgendadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setPalestrasAgendadas(List<Palestra> palestrasAgendadas) {
        this.palestrasAgendadas = palestrasAgendadas;
    }
}
