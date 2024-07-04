package Main.OrdenaçãoProduto;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class CadastroProdutos {

    private Set <Produto> produtoSet;

    public CadastroProdutos (){
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(String nome, Long código, double preço, int quantidade){
        produtoSet.add(new Produto (nome, código, preço, quantidade));
    }
    
    public Set <Produto> exibirProdutoNome (){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
            return produtoPorNome;
    }
    public Set <Produto> exibirProdutoValor(){
        Set <Produto> produtoPorPreço = new TreeSet <> (new ComparatorPorPreço());    
    produtoPorPreço.addAll(produtoSet);
        return produtoPorPreço;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto 5", 45l, 10.45, 3);
        cadastroProdutos.adicionarProduto("Produto 3", 2l, 30, 5);
        cadastroProdutos.adicionarProduto("Produto 7", 562l, 28.50, 8);
        cadastroProdutos.adicionarProduto("Produto 2", 2l, 13, 5);

            System.out.println(cadastroProdutos.produtoSet);

            System.out.println(cadastroProdutos.exibirProdutoNome());

            System.out.println(cadastroProdutos.exibirProdutoValor());

    

    }
}
