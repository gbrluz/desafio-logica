package ex20;

import java.util.ArrayList;

public class Estoque {
    private int id = 1;
    private ArrayList<Produto> listaDeProdutos;


    public Estoque() {
        this.listaDeProdutos = new ArrayList<>();
    }

    public void inicializaEstoque() {
        listaDeProdutos = new ArrayList<>();
    }

    public Produto encontraProduto(String nome) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Produto encontraProduto(int id) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void cadastraProduto(Produto produto) {
        listaDeProdutos.add(produto);
    }

    public void imprimeCatalogoDoEstoque() {
        for (Produto produto : listaDeProdutos) {
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
        }
    }

    public boolean darBaixaEmEstoque(String nome, int quantidadeParaDarBaixa) {
        Produto produto = encontraProduto(nome);
        if (produto != null && produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa) {
            produto.setAtributo(produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        }
        return false;
    }

    public boolean darBaixaEmEstoque(int id, int quantidadeParaDarBaixa) {
        Produto produto = encontraProduto(id);
        if (produto != null && produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa) {
            produto.setAtributo(produto.getQuantidadeEmEstoque() - quantidadeParaDarBaixa);
            return true;
        }
        return false;
    }

    public int getQuantidadeAtualEmEstoque(Produto produto) {
        Produto p = encontraProduto(produto.getId());
        return p != null ? p.getQuantidadeEmEstoque() : 0;
    }

    public int getPosicaoDoProdutoNaLista(Produto produto) {
        return listaDeProdutos.indexOf(produto);
    }

    public boolean temEstoqueOuNao(Produto produto, int quantidadeParaDarBaixa) {
        return produto.getQuantidadeEmEstoque() >= quantidadeParaDarBaixa;
    }
}
