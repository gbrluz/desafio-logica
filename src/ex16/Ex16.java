package ex16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();
        List<Emprestimo> emprestimos = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Inserir Livro");
            System.out.println("2 - Inserir Pessoa");
            System.out.println("3 - Inserir Empréstimo");
            System.out.println("4 - Exibir Empréstimos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Inserir Livro:");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    livros.add(new Livro(titulo, autor));
                    System.out.println("Livro inserido com sucesso!");
                    break;

                case 2:
                    System.out.println("Inserir Pessoa:");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    pessoas.add(new Pessoa(nome));
                    System.out.println("Pessoa inserida com sucesso!");
                    break;

                case 3:
                    if (livros.isEmpty()) {
                        System.out.println("Nenhum livro disponível para empréstimo.");
                        break;
                    }
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada para realizar empréstimo.");
                        break;
                    }
                    System.out.println("Inserir Empréstimo:");
                    System.out.println("Escolha um livro pelo índice:");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println(i + " - " + livros.get(i).getTitulo());
                    }
                    int livroIndice = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Escolha uma pessoa pelo índice:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int pessoaIndice = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Data de Empréstimo (yyyy-mm-dd): ");
                    LocalDate dataEmprestimo = LocalDate.parse(scanner.nextLine());
                    System.out.print("Data de Devolução (yyyy-mm-dd): ");
                    LocalDate dataDevolucao = LocalDate.parse(scanner.nextLine());

                    emprestimos.add(new Emprestimo(livros.get(livroIndice), pessoas.get(pessoaIndice), dataEmprestimo, dataDevolucao));
                    System.out.println("Empréstimo realizado com sucesso!");
                    break;

                case 4:
                    if (emprestimos.isEmpty()) {
                        System.out.println("Nenhum empréstimo registrado.");
                    } else {
                        System.out.println("Lista de Empréstimos:");
                        for (Emprestimo emprestimo : emprestimos) {
                            emprestimo.exibirEmprestimo();
                        }
                    }
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


