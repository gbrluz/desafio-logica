package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println("Digite sua idade: ");
        Scanner scanner = new Scanner(System.in);
        Integer entrada = scanner.nextInt();

        if (entrada>=18) {
            System.out.println("É maior de idade - "+entrada+" anos");
        }else{
            System.out.println("Não é maior de idade - "+entrada+" anos");
        }
    }
}
