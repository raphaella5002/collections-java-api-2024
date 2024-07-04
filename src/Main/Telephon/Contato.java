package Main.Telephon;

public class Contato {
    private String nome;
    private int númeroTelefone;

public Contato (String nome, int númeroTelefone){
    this.nome = nome;
    this.númeroTelefone = númeroTelefone;
}

public String getNome(){
    return nome;
}
public int getNúmeroTelefone(){
    return númeroTelefone;
}
public void setNúmeroTelefone (int númeroTelefone){
    this.númeroTelefone = númeroTelefone;
}

public String toString() {
    return "[ Contato > Nome = " + nome + ", númeroTelefone = " + númeroTelefone + "]";
}

public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    return result;
}

public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Contato other = (Contato) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    return true;
    }

}
