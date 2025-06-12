package model;

public class Laboratorio extends Local {
    private int numeroComputadores;
    private String tipo;

    public Laboratorio(String nomeIdentificador, int capacidadeMaxima, String blocoPredio, int numeroComputadores, String tipo) {
        super(nomeIdentificador, capacidadeMaxima, blocoPredio);
        this.numeroComputadores = numeroComputadores;
        this.tipo = tipo;
    }

    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumeroComputadores(int numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
