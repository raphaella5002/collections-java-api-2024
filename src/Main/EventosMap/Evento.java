package Main.EventosMap;

public class Evento {

    private String nome;
    private String atração;

    //construtores

    public Evento (String nome, String atração){
        this.nome = nome;
        this.atração = atração;
    }

    //getters

    public String getNome (){
        return nome;
    }
    public String getAtração(){
        return atração;
    }

    //To String - impressão terminal

    public String toString() {
        return " | Evento -" + nome + ", Atração: " + atração + " | ";
    }

    


    
}
