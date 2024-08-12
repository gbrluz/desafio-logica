package ex9;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        int n = scanner.nextInt();

        if (n <0) {
            System.out.println("Número invalido, informe um numero positivo");
        } else {
            System.out.println("Fibonacci até "+ n +":");
                fibonacci(n);
        }

    }

    public static void fibonacci(int n) {
        int x = 0, y = 1;
        while (x < n) {
            System.out.println(x+ "");
            int z = x + y;
            x = y;
            y = z;
        }
    }

}
