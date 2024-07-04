package Main.OperaçãoMap.PesquisaMap;

public class Produto {
    //atributos

    private String nome;
    private double preço;
    private int quantidade;

    //contrutores

    public Produto(String nome, double preço, int quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    //getters

    public String getNome(){
        return nome;
    }
    public double getPreço(){
        return preço;
    }
    public int getQuantidade(){
        return quantidade;
    }

    //facilitar impressão no terminal - ToString

    public String toString() {
        return "Produto > Nome = " + nome + ", Preço = " + preço + ", Quantidade = " + quantidade + " <";
    }
    
}
