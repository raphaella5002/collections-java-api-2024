package Main.List.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList <>();
    }

    public void adicionarLivros (String título, String autor, int anoDePublicação){
        livroList.add(new Livro (título, autor, anoDePublicação));
    }
    public List <Livro> pesquisarPorAutor (String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
}
    }
        }
            return livrosPorAutor;
    }
    public List <Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
               if (l.getAnoDePublicação() >= anoInicial && l.getAnoDePublicação() <= anoFinal) {
                livrosPorIntervaloAnos.add(l);
               } 
            }
    }
            return livrosPorIntervaloAnos;    
}
    public Livro pesquisarPorTítulo (String título){
        Livro livroPorTítulo = null;
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getTítulo().equalsIgnoreCase(título)){
                    livroPorTítulo = l;
                    break;
                }
            }
        }
        return livroPorTítulo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 4", 1994);

            System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
            System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2019, 2021));
            System.out.println(catalogoLivros.pesquisarPorTítulo("Livro 1"));
        }


}