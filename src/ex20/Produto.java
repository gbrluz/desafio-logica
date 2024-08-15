package ex20;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int id, String nome, double preco, int quantidadeEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setAtributo(Object atributo) {
        if (atributo instanceof Integer) {
            this.id = (int) atributo;
        } else if (atributo instanceof String) {
            this.nome = (String) atributo;
        } else if (atributo instanceof Double) {
            this.preco = (double) atributo;
        } else if (atributo instanceof Produto) {
            Produto p = (Produto) atributo;
            this.id = p.id;
            this.nome = p.nome;
            this.preco = p.preco;
            this.quantidadeEmEstoque = p.quantidadeEmEstoque;
        }
    }

    public Object getAtributo() {
        return this;
    }

}
