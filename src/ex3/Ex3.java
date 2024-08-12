package ex3;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção ");
        System.out.println("0 - Pedra, 1 - Papel ou 2 - Tesoura ");

        Integer jogada = scanner.nextInt();
        if (jogada < 0 || jogada > 2) {
            System.out.println("Entrada inválida");
            return;
        }

        Random random = new Random();
        Integer jogadaMaquina = random.nextInt(3);
        System.out.println("A máquina escolheu: +" + jogadaMaquina);

        if (jogada == jogadaMaquina) {
            System.out.println("Resultado: Empate");
        } else if ((jogada == 0) && (jogadaMaquina == 2) ||
                    (jogada == 1) && (jogadaMaquina == 0) ||
                    (jogada == 2) && (jogadaMaquina == 1) ){
            System.out.println("Resultado: Você venceu");
        } else {
            System.out.println("Resultado: Máquina venceu");
        }
    }
}
