package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    protected String titulo;
    protected Local local;
    protected List<Participante> participantesInscritos;

    public Evento(String titulo, LocalDate data, Local local) {
        this.titulo = titulo;
        this.local = local;
        this.participantesInscritos = new ArrayList<>();

        if (local != null) {
            local.addEvento(this);
        }
    }

    public boolean inscreverParticipante(Participante participante) {

        this.participantesInscritos.add(participante);
        participante.addEvento(this);

        System.out.println("Inscrição de " + participante.getNome() + " em '" + this.titulo + "' realizada com sucesso.");
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Participante> getParticipantesInscritos() {
        return participantesInscritos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setParticipantesInscritos(List<Participante> participantesInscritos) {
        this.participantesInscritos = participantesInscritos;
    }
}
