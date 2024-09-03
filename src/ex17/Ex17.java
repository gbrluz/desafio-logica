package ex17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Inserir Pessoa");
            System.out.println("2 - Exibir Árvore Genealógica");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Inserir Pessoa:");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    Pessoa pai = null, mae = null;

                    if (!pessoas.isEmpty()) {
                        System.out.println("Escolher pai (ou deixar em branco):");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println(i + " - " + pessoas.get(i).getNome());
                        }
                        String paiIndice = scanner.nextLine();
                        if (!paiIndice.isEmpty()) {
                            pai = pessoas.get(Integer.parseInt(paiIndice));
                        }

                        System.out.println("Escolher mãe (ou deixar em branco):");
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.println(i + " - " + pessoas.get(i).getNome());
                        }
                        String maeIndice = scanner.nextLine();
                        if (!maeIndice.isEmpty()) {
                            mae = pessoas.get(Integer.parseInt(maeIndice));
                        }
                    }

                    pessoas.add(new Pessoa(nome, idade, pai, mae));
                    System.out.println("Pessoa inserida com sucesso!");
                    break;

                case 2:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                        break;
                    }

                    System.out.println("Escolha uma pessoa para exibir a árvore genealógica:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int pessoaIndice = scanner.nextInt();
                    scanner.nextLine();

                    Pessoa pessoaSelecionada = pessoas.get(pessoaIndice);
                    pessoaSelecionada.exibirArvoreGenealogica();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
