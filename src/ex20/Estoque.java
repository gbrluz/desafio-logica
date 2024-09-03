package ex20;

import java.util.ArrayList;

public class Estoque {
    private int id;
    private ArrayList<Produto> listaDeProdutos;

    public Estoque(int id) {
        this.id = id;
        this.listaDeProdutos = new ArrayList<>();
    }

    public void inicializarEstoque() {
        adicionarProduto(new Produto(1, "Queijo", 14.5,50));
        adicionarProduto(new Produto(2, "Leite", 4.5,100));
        adicionarProduto(new Produto(3, "Pão", 10.5,300));
    }

    public Produto encontrarProduto(String nome) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void adicionarProduto(Produto produto) {
        listaDeProdutos.add(produto);
    }

    public boolean darBaixaNoEstoque(Produto produto, int quantidadeParaDarBaixa) {
        Produto encontrado = encontrarProduto(produto.getNome());
        if (encontrado != null && encontrado.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa) {
            encontrado.setQuantidadeEmEstoque(encontrado.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        }
        return false;
    }

    public void imprimirEstoque() {
        System.out.println("Estoque:");
        for (Produto produto : listaDeProdutos) {
            System.out.println("Produto: " + produto.getNome() + ", Quantidade: " + produto.getQuantidadeEmEstoque());
        }
    }
}
