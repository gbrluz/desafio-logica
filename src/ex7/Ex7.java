package ex7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        int n = scanner.nextInt();

        if (n <0) {
            System.out.println("Número invalido, informe um numero positivo");
        } else {
            System.out.println("Fibonacci F"+ n +":");
            for (int i = 0; i < n; i++) {
                System.out.println(fibonacci(i));
            }
        }

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int x = 0, y = 1, z;
            for (int i = 1; i < n; i++) {
                z = x + y;
                x = y;
                y = z;
            }
            return y;
        }
    }
}
