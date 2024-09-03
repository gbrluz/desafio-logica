package ex6;

import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];

        int menor = 100;
        int maior = 0;

        System.out.println("Números aleatórios: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(101);
            System.out.print(numeros[i] + ", " );

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("\nMenor valor: "+menor);
        System.out.println("Maior valor: "+maior);
    }
}
