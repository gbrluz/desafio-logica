package ex20;

import java.util.Scanner;

public class Menu {
    private Estoque estoque;
    private Pedido pedido;

    public Menu() {
        this.estoque = new Estoque(1);
        this.pedido = new Pedido();
    }

    public void inicializar() {
        estoque.inicializarEstoque();
    }

    public void controlMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Mostrar Estoque");
            System.out.println("2. Adicionar Item ao Pedido");
            System.out.println("3. Finalizar Pedido");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    estoque.imprimirEstoque();
                    break;
                case 2:
                    adicionarItemAoPedido(scanner);
                    break;
                case 3:
                    finalizarPedido(scanner);
                    break;
                case 0:
                    System.out.println("Saindo da aplicação");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while (opcao != 0);

        scanner.close();
    }

    private void adicionarItemAoPedido(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.next();
        Produto produto = estoque.encontrarProduto(nomeProduto);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        if (estoque.darBaixaNoEstoque(produto, quantidade)) {
            Item item = new Item(produto, quantidade);
            pedido.adicionarItem(item);
            System.out.println("Item adicionado ao pedido.");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    private void finalizarPedido(Scanner scanner) {
        pedido.imprimirPedido();
        System.out.print("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();

        double troco = pedido.calcularTroco(valorPago);
        System.out.println("Troco: " + troco);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int valorRestante = (int) troco;

        System.out.println("Quantidade de notas para o troco:");
        for (int nota : notas) {
            int quantidade = valorRestante / nota;
            if (quantidade > 0) {
                System.out.println("Nota de " + nota + ": " + quantidade + " unidades");
                valorRestante %= nota;
            }
        }
    }
}
