package ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número para formar sua tabuada: ");
        Integer numero = scanner.nextInt();

        System.out.println("Tabuada: ");
        for (int i = 1; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }

    }
}
