package ex20;

import java.util.Scanner;

public class Menu {

    public void controlaMenu() {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Pedido pedido = new Pedido();

        estoque.inicializaEstoque();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Mostrar Estoque");
            System.out.println("2. Adicionar Item ao Pedido");
            System.out.println("3. Imprimir Pedido");
            System.out.println("4. Imprimir Valor Total do Pedido");
            System.out.println("5. Limpar Carrinho");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    mostraEstoque(estoque);
                    break;
                case 2:
                    pedido.adicionaItem();
                    break;
                case 3:
                    pedido.imprimePedido();
                    break;
                case 4:
                    pedido.imprimeValorTotal();
                    break;
                case 5:
                    pedido.limparCarrinho();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void mostraEstoque(Estoque estoque) {
        estoque.imprimeCatalogoDoEstoque();
    }

    public void switchCase() {
        controlaMenu();
    }
}
