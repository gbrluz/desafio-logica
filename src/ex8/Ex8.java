package ex8;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um número (10 para finalizar)");
            numero = scanner.nextInt();
        } while(numero !=10);

        System.out.println("Programa finalizado com sucesso!");

    }
}
