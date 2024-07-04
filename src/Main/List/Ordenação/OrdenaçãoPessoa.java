package Main.List.Ordenação;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OrdenaçãoPessoa {
    private List <Pessoa> personList;

public OrdenaçãoPessoa (){
this.personList = new ArrayList<>();
}
public void adicionarPessoa (String nome, int idade, double altura){
    personList.add(new Pessoa(nome, idade, altura));
}

public List<Pessoa> ordenarPorIdade (){
    List<Pessoa> pessoaPorIdade = new ArrayList <> (personList); 
    Collections.sort(pessoaPorIdade);
    return pessoaPorIdade;
}
public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoaPorAltura = new ArrayList<>(personList);
    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
    return pessoaPorAltura;
}

public static void main(String[] args) {
    
    OrdenaçãoPessoa ordenaçãoPessoa = new OrdenaçãoPessoa();
    ordenaçãoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
    ordenaçãoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
    ordenaçãoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
    ordenaçãoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

    System.out.println(ordenaçãoPessoa.ordenarPorIdade());
    System.out.println(ordenaçãoPessoa.ordenarPorAltura());
}

    
    }
