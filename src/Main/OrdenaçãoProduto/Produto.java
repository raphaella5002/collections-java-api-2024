package Main.OrdenaçãoProduto;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    //atributos

    private String nome;
    private Long código;
    private double preço;
    private int quantidade;

public int compareTo(Produto p){
    return nome.compareToIgnoreCase(p.getNome());
}

    //construtor

    public Produto (String nome,Long código, double preço, int quantidade){
        this.nome = nome;
        this.código = código;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    // métodos getters

    public String getNome(){
        return nome;
    }
    public Long getCódigo(){
        return código;
    }
    public double getPreço(){
        return preço;
    }
    public int getQuantidade(){
        return quantidade;
    }

    //facilitar impressão

    public String toString() {
        return "Produto [ Nome = " + nome + ", Código = " + código + ", Preço = " + preço + ", Quantidade = " + quantidade + "]";
    }

        //deletar códigos iguais

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((código == null) ? 0 : código.hashCode());
            return result;
        }
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Produto other = (Produto) obj;
            if (código == null) {
                if (other.código != null)
                    return false;
            } else if (!código.equals(other.código))
                return false;
            return true;
        }
    }

    class ComparatorPorPreço implements Comparator<Produto>{

        public int compare(Produto p1, Produto p2){
            return Double.compare(p1.getPreço(), p2.getPreço());
        }

    }
