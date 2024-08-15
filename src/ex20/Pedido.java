package ex20;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private ArrayList<Item> listaDeItens = new ArrayList<>();
    private double valorTotalDoPedido = 0;

    public void calculaValorTotal() {
        valorTotalDoPedido = 0;
        for (Item item : listaDeItens) {
            valorTotalDoPedido += item.getValorDoItem();
        }
    }

    public boolean adicionaItemNaLista(Produto produto, int quantidade) {
        if (produto != null && quantidade > 0) {
            Item item = new Item(produto, quantidade);
            listaDeItens.add(item);
            calculaValorTotal();
            return true;
        }
        return false;
    }

    public void imprimePedido() {
        for (Item item : listaDeItens) {
            System.out.println("Produto: " + item.getProduto().getNome() + ", Quantidade: " + item.getQuantidade() + ", Valor do Item: " + item.getValorDoItem());
        }
    }

    public void imprimeValorTotal() {
        System.out.println("Valor Total do Pedido: " + valorTotalDoPedido);
    }

    public void adicionaItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        Estoque estoque = new Estoque();
        Produto produto = estoque.encontraProduto(nomeProduto);
        if (produto != null && quantidade > 0) {
            adicionaItemNaLista(produto, quantidade);
            imprimeValorTotal();
        } else {
            System.out.println("Produto não encontrado ou quantidade inválida.");
        }
    }

    public String recebeNomeDoTeclado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        return scanner.nextLine();
    }

    public int recebeQuantidadeDoTeclado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade: ");
        return scanner.nextInt();
    }

    public void limparCarrinho() {
        listaDeItens.clear();
        calculaValorTotal();
    }

    public Object getAtributo() {
        return this;
    }

    public void setAtributo(Object atributo) {
        if (atributo instanceof ArrayList) {
            this.listaDeItens = (ArrayList<Item>) atributo;
        } else if (atributo instanceof Double) {
            this.valorTotalDoPedido = (Double) atributo;
        }
    }

    public double calculaTroco(double valorPago) {
        if (valorPago < valorTotalDoPedido) {
            System.out.println("Valor pago é insuficiente.");
            return 0;
        }
        double troco = valorPago - valorTotalDoPedido;
        System.out.println("Troco: " + troco);
        return troco;
    }

    public void calculaMenorQuantidadeDeNotas(double troco) {
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];

        double valorRestante = troco;

        for (int i = 0; i < notas.length; i++) {
            if (valorRestante >= notas[i]) {
                quantidadeNotas[i] = (int) (valorRestante / notas[i]);
                valorRestante -= quantidadeNotas[i] * notas[i];
            }
        }

        System.out.println("Menor quantidade de notas para o troco:");
        for (int i = 0; i < notas.length; i++) {
            if (quantidadeNotas[i] > 0) {
                System.out.println(notas[i] + " : " + quantidadeNotas[i]);
            }
        }
    }
}
