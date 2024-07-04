package Main.OperaçãoMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContato(){
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato (String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
        //método put serve para adicionar como para atualizar
    }
    public void removerContato (String nome){
        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome (String nome){
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome =  agendaContatosMap.get(nome);
        }
            return numeroPorNome;
        }


        public static void main(String[] args) {
            AgendaContato agendaContato = new AgendaContato();
            
            agendaContato.adicionarContato("João", 12389);
            agendaContato.adicionarContato("Maria", 16789);
            agendaContato.adicionarContato("Maria Silva", 78964);
            agendaContato.adicionarContato("Raphaella", 45632);
            agendaContato.adicionarContato("Felipe", 32897);
            agendaContato.adicionarContato("João", 85564);

            agendaContato.exibirContatos();

            agendaContato.removerContato("Maria Silva");
            agendaContato.exibirContatos();

            System.out.println("O número é: " + agendaContato.pesquisarPorNome("Raphaella"));


        }
    }

