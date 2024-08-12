package ex10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz: ");
        int tam = scanner.nextInt();

        int[][] matriz = new int[tam][tam];

        System.out.println("Digite os valores da matriz");

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int soma = calcularSoma(matriz);

        System.out.println("A soma da diagonal é: "+ soma);
    }

    public static int calcularSoma(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }
}
