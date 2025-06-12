package model;

import java.time.LocalDate;
import java.util.List;

public class Minicurso extends Evento {
    private List<Instrutor> instrutores;

    public Minicurso(String titulo, LocalDate data, Local local, List<Instrutor> instrutores) {
        super(titulo, data, local);
        this.instrutores = instrutores;

        for(Instrutor instrutor : instrutores) {
            instrutor.addMinicurso(this);
        }
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }
}
