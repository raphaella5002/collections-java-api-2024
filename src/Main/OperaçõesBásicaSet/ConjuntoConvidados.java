package Main.OperaçõesBásicaSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado (String nome, int códigoConvite){
        convidadoSet.add(new Convidado(nome, códigoConvite));
    }

    public void removerConvidadoPorCódigoConvite (int códigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
        if (c .getCódigoConvite() == códigoConvite){
        convidadoParaRemover = c;
          break;
      }
     }

convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
            System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " pessoas dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1267);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1268);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1268);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1270);

            System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " no total no Set de convidados.");
        conjuntoConvidados.removerConvidadoPorCódigoConvite(1268);
            System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " pessoas dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();
    }
}   
