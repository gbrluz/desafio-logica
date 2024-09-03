package ex20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private ArrayList<Item> listaDeItens;
    private double valorTotalDoPedido;

    public Pedido() {
        this.listaDeItens = new ArrayList<>();
        this.valorTotalDoPedido = 0.0;
    }

    public void adicionarItem(Item item) {
        listaDeItens.add(item);
        valorTotalDoPedido += item.valorTotal();
    }

    public double calcularValorTotal() {
        return valorTotalDoPedido;
    }

    public double calcularTroco(double valorPago) {
        if (valorPago < valorTotalDoPedido) {
            System.out.println("Valor pago insuficente.");
            return 0;
        }
        return valorPago - valorTotalDoPedido;
    }

    public void imprimirPedido() {
        System.out.println("Pedido:");
        for (Item item : listaDeItens) {
            System.out.println("Produto: " + item.getProduto().getNome() + ", Quantidade: " + item.getQuantidade() + ", Preço: " + item.getProduto().getPreco());
        }
        System.out.println("Valor total: " + calcularValorTotal());
    }
}
