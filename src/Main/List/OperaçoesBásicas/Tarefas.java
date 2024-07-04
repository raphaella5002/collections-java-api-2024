package Main.List.OperaçoesBásicas;

public class Tarefas {
    //atributo

    private String descrição;

    public Tarefas (String descrição) {
        this.descrição = descrição;

    }
    public String getDescrição(){
        return descrição;
    }

    public String toString(){
        return descrição;
    }
}
