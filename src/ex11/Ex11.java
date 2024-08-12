package ex11;

import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        int[] vetor = new int[100];
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        System.out.println("Vetor normal: ");
        exibeVetor(vetor);

        bubbleSort(vetor);

        System.out.println("\nVetor ordenado: ");
        exibeVetor(vetor);

    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void exibeVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
