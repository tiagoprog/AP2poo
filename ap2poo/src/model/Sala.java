package model;

public class Sala extends Local {
    private int numeroSala;
    private boolean temEquipamentoMultimidia;

    public Sala(String nomeIdentificador, int capacidadeMaxima, String blocoPredio, int numeroSala, boolean temEquipamentoMultimidia) {
        // Chama o construtor da classe pai (Local)
        super(nomeIdentificador, capacidadeMaxima, blocoPredio);
        this.numeroSala = numeroSala;
        this.temEquipamentoMultimidia = temEquipamentoMultimidia;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public boolean temEquipamentoMultimidia() {
        return temEquipamentoMultimidia;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isTemEquipamentoMultimidia() {
        return temEquipamentoMultimidia;
    }

    public void setTemEquipamentoMultimidia(boolean temEquipamentoMultimidia) {
        this.temEquipamentoMultimidia = temEquipamentoMultimidia;
    }
}
