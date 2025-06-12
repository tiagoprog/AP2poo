package model;

import java.time.LocalDate;

public class Palestra extends Evento {
    private Palestrante palestrante;

    public Palestra(String titulo, LocalDate data, Local local, Palestrante palestrante) {
        super(titulo, data, local);
        this.palestrante = palestrante;

        if (palestrante != null) {
            palestrante.addPalestra(this);
        }
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
}
