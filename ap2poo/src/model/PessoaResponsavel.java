package model;

public class PessoaResponsavel {
    protected String nome;
    protected String email;

    public PessoaResponsavel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
