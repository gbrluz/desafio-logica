package ex12;

import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        int[] vetor1 = new int[50];
        int[] vetor2 = new int[50];
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            vetor1[i] = random.nextInt(1000);
            vetor2[i] = random.nextInt(1000);
        }

        bubbleSort(vetor1);
        bubbleSort(vetor2);

        System.out.println("Vetor 1 ordenado: ");
        exibeVetor(vetor1);
        System.out.println("Vetor 2 ordenado: ");
        exibeVetor(vetor2);

        int[] vetor3 = new int[100];
        System.arraycopy(vetor1, 0, vetor3, 0, 50);
        System.arraycopy(vetor2, 0, vetor3, 50, 50);

        bubbleSort(vetor3);

        System.out.println("Vetor combinado e ordenado: ");
        exibeVetor(vetor3);
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
