package ex13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Infome a nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Infome a nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Infome a nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);
        System.out.println("Media: " + media);
        System.out.println(retornarStatus(media));
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String retornarStatus(double media){
        if (media <4) {
            return "Reprovado";
        } else if (media >= 4 && media <= 6) {
            return "Verificação Suplementar";
        } else {
            return "Aprovado";
        }
    }
}
