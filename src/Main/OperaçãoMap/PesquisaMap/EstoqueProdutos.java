package Main.OperaçãoMap.PesquisaMap;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos (){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long código, String nome, double preço, int quantidade){
        estoqueProdutosMap.put(código, new Produto (nome, preço, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }


    public Double CalcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()){
            valorTotalEstoque += p.getQuantidade() * p.getPreço();
        }            
    }
        return valorTotalEstoque;

  }  


  public Produto obterProdutoMaisCaro(){
    Produto produtoMaisCaro = null;
    double maiorPreço = Double.MIN_VALUE;
    if (!estoqueProdutosMap.isEmpty()) {
        for(Produto p : estoqueProdutosMap.values()){
            if (p.getPreço() > maiorPreço) {
                produtoMaisCaro = p;
            }
        }
    }
        return produtoMaisCaro;
  }

  
  public static void main(String[] args) {
    
    EstoqueProdutos estoque = new EstoqueProdutos();
    //estoque.exibirProdutos();

    estoque.adicionarProduto(1l, "Cadeira", 15.0, 10);
    estoque.adicionarProduto(2l, "Mesa", 15.0, 5);
    estoque.adicionarProduto(3l, "Prato", 8.0, 3);

    estoque.exibirProdutos();
    System.out.println("Valor total do estoque: R$" + estoque.CalcularValorTotalEstoque());
    System.out.println("Produto mais barato: R$" + estoque.obterProdutoMaisCaro());
    }
}
