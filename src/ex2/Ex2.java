package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        Float preco = scanner.nextFloat();

        System.out.println("Digite a quantidade do produto: ");
        Integer quantidade = scanner.nextInt();

        Float valorTotal = preco * quantidade;

        if (quantidade > 50) {
            valorTotal *= 0.75F;
        } else if (quantidade > 20) {
            valorTotal *= 0.80F;
        } else if (quantidade > 10) {
            valorTotal *= 0.90F;
        }

        System.out.println("Valor total da sua compra de "
                +quantidade+" unidades de "
                +nome+": "
                +valorTotal);
    }
}
