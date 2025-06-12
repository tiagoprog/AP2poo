package model;

public class Auditorio extends Local {
    private boolean temSistemaSom;
    private boolean temEstruturaTraducao;

    public Auditorio(String nomeIdentificador, int capacidadeMaxima, String blocoPredio, boolean temSistemaSom, boolean temEstruturaTraducao) {
        super(nomeIdentificador, capacidadeMaxima, blocoPredio);
        this.temSistemaSom = temSistemaSom;
        this.temEstruturaTraducao = temEstruturaTraducao;
    }

    public boolean temSistemaSom() {
        return temSistemaSom;
    }

    public boolean temEstruturaTraducao() {
        return temEstruturaTraducao;
    }

    public boolean isTemSistemaSom() {
        return temSistemaSom;
    }

    public void setTemSistemaSom(boolean temSistemaSom) {
        this.temSistemaSom = temSistemaSom;
    }

    public boolean isTemEstruturaTraducao() {
        return temEstruturaTraducao;
    }

    public void setTemEstruturaTraducao(boolean temEstruturaTraducao) {
        this.temEstruturaTraducao = temEstruturaTraducao;
    }
}
