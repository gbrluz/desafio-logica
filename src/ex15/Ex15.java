package ex15;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Escolha uma opção ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciação");
        System.out.println("Digite: ");

        Integer opcao = scanner.nextInt();

        System.out.println("Digite o primeiro valor: ");
        Double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        Double num2 = scanner.nextDouble();

        double resultado = 0;

        Calculadora calculadora = new Calculadora(num1, num2);

        switch (opcao) {
            case 1:
                resultado = calculadora.soma(num1, num2);
                break;
            case 2:
                resultado = calculadora.subtracao(num1, num2);
                break;
            case 3:
                resultado = calculadora.multiplicacao(num1, num2);
                break;
            case 4:
                if (num2 != (double) 0) {
                    resultado = calculadora.divisao(num1,num2);
                    break;
                }
                System.out.println("Impossível dividir por zero.");
                break;
            case 5:
                resultado = calculadora.potencia(num1, num2);
                break;
            default:
                System.out.println("Opção inválida.");
                resultado = 0;
        }

        System.out.println("Resultado: " + resultado);
    }

}
