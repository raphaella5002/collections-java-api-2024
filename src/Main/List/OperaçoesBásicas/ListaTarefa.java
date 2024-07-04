package Main.List.OperaçoesBásicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    private List <Tarefas> tarefaList;

    public ListaTarefa (){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa (String descrição){
        tarefaList.add(new Tarefas(descrição));
    }

    public void removerTarefa (String descriçaõ){
        List<Tarefas> tarefaParaRemover = new ArrayList<>();
    for (Tarefas t : tarefaList) {
        if (t.getDescrição().equalsIgnoreCase(descriçaõ)){
        tarefaParaRemover.add(t);
    }
} 
    tarefaList.removeAll(tarefaParaRemover);
}

    public int obterNúmeroTotalDeTarefas() {
        return tarefaList.size();
    }   

    public void obterDescriçãoDeTarefas () {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa ();
            System.out.println("O número total de tarefas da lista é: " + listaTarefa.obterNúmeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 1");
            System.out.println("O número total de tarefas da lista é: " + listaTarefa.obterNúmeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
            System.out.println("O número total de tarefas da lista é: " + listaTarefa.obterNúmeroTotalDeTarefas());

        listaTarefa.obterDescriçãoDeTarefas();
    }
}


