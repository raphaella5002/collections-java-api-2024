package Main.OperaçõesBásicaSet;

public class Convidado {
    //atrbutos

    private String nome;
    private int códigoConvite;

    //construtor

    public Convidado (String nome, int códigoConvite){
    this.nome = nome;
    this.códigoConvite = códigoConvite;
    }

        //deletar códigos iguais

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + códigoConvite;
            return result;
        }
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Convidado other = (Convidado) obj;
            if (códigoConvite != other.códigoConvite)
                return false;
            return true;
        } 

        //Getters

    public String getNome(){
        return nome;
    }
    public int getCódigoConvite(){
        return códigoConvite;
    }

    // toString (para não mostrar onde se encontra tal informação)

    public String toString() {
        return "Convidado [nome=" + nome + ", códigoConvite=" + códigoConvite + "]";
    }
    
}
