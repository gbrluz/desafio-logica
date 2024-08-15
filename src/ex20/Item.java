package ex20;

public class Item {
    private Produto produto;
    private int quantidade;
    private double valorDoItem;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        defineValorTotal();
    }

    public void defineValorTotal() {
        this.valorDoItem = this.quantidade * this.produto.getPreco();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorDoItem() {
        return valorDoItem;
    }

    public void setAtributo(Object atributo) {
        if (atributo instanceof Integer) {
            this.quantidade = (int) atributo;
        } else if (atributo instanceof Produto) {
            this.produto = (Produto) atributo;
        }
    }

    public Object getAtributo() {
        return this;
    }
}
