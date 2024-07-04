package Main.EventosMap;

import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    //atributo

    private Map <LocalDate, Evento> eventosMap;

    //construtor

    public AgendaEventos (){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento (LocalDate data, String nome, String atração){
        //Evento evento = new Evento (nome, atração);
        eventosMap.put(data, new Evento (nome, atração));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
            System.out.println(eventosTreeMap);
    }
    public void obterPróximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate próximaData = null;
        Evento próximoEvento = null;
        Map <LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> Entry : eventosTreeMap.entrySet()){
            if (Entry.getKey().isEqual(dataAtual) || Entry.getKey().isAfter(dataAtual)) {
                próximaData = Entry.getKey();
                próximoEvento = Entry.getValue();
                System.out.println("O próximo evento: " + próximoEvento + " acontecerá na data: " + próximaData);
            break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, 07, 13), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 07, 19), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 06, 22), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 07, 25), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 2), "Evento 5", "Atração 5");



        agendaEventos.exibirAgenda();
        agendaEventos.obterPróximoEvento();
    }

}
