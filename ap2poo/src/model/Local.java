package model;

import java.util.ArrayList;
import java.util.List;

public class Local {
    protected String nomeIdentificador;
    protected int capacidadeMaxima;
    protected List<Evento> eventosAgendados;

    public Local(String nomeIdentificador, int capacidadeMaxima, String blocoPredio) {
        this.nomeIdentificador = nomeIdentificador;
        this.capacidadeMaxima = capacidadeMaxima;
        this.eventosAgendados = new ArrayList<>();
    }


    public void addEvento(Evento evento) {
        this.eventosAgendados.add(evento);
    }

    public String getNomeIdentificador() {
        return nomeIdentificador;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Evento> getEventosAgendados() {
        return eventosAgendados;
    }

    public void setNomeIdentificador(String nomeIdentificador) {
        this.nomeIdentificador = nomeIdentificador;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void setEventosAgendados(List<Evento> eventosAgendados) {
        this.eventosAgendados = eventosAgendados;
    }
}