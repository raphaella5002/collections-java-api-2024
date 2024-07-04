package Main.Telephon;

import java.util.HashSet;
import java.util.Set;

public class Agenda {
    private Set<Contato> contatoSet;

public Agenda(){
    this.contatoSet = new HashSet<>();
}

public void adicionarContato(String nome, int númeroTelefone){
    contatoSet.add(new Contato(nome, númeroTelefone));
}
public void exibirContato(){
    System.out.println(contatoSet);
}

public Set<Contato> pesquisarPorNome (String nome){
    Set <Contato> contatosPorNome = new HashSet<>();
for (Contato c : contatoSet){
    if (c.getNome(). startsWith(nome)){
        contatosPorNome.add(c);
    }
}

    return contatosPorNome;

}

public Contato atualizarContato (String nome, int númeroNovo){
    Contato contatoAtualizado = null;
    for(Contato c: contatoSet){
        if (c.getNome().equalsIgnoreCase(nome)){
            c.setNúmeroTelefone(númeroNovo);
            contatoAtualizado = c;
            break;
        }
    }
    return contatoAtualizado;
}


public static void main(String[] args) {
    Agenda agenda = new Agenda();

    agenda.exibirContato();

    agenda.adicionarContato( "Camila",  99876);
    agenda.adicionarContato( "Camila",  00000);
    agenda.adicionarContato( "Camila Ferreira",  456733);
    agenda.adicionarContato( "Camila San'ts",  786748);
    agenda.adicionarContato( "Isabela",  445627);

    agenda.exibirContato();

        System.out.println(agenda.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agenda.atualizarContato("Isabela", 33452));

    
}
}
