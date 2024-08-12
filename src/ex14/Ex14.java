package ex14;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        int segundosTotais = lerSegundos();
        int horas = retornarHoras(segundosTotais);
        int minutos = retornarMinutos(segundosTotais);
        int segundos = retornarSegundos(segundosTotais);
        retornaHoraFormatada(segundosTotais, horas, minutos, segundos);

    }

    public static int lerSegundos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo em segundos: ");
        return scanner.nextInt();
    }

    public static int retornarHoras(int segundos) {
        return segundos / 3600;
    }

    public static int retornarMinutos(int segundos) {
        return (segundos % 3600) / 60;
    }

    public static int retornarSegundos(int segundos) {
        return segundos % 60;
    }

    public static void retornaHoraFormatada(int segundosTotais, int horas, int minutos, int segundos) {
        System.out.print(segundosTotais + " segundos equivalem a " + horas + "h" + minutos + "min" + segundos+ "seg");
    }
}
