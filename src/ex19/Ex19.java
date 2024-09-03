package ex19;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        AgendaTelefonica ag = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("Agenda telefonica:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Listar contatos");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato: ");
                    String nome = scanner.next();
                    System.out.println("Digite o telefone do contato: ");
                    String telefone = scanner.next();
                    Contato contato = new Contato(nome, telefone);
                    ag.adicionarContato(contato);
                    break;
                case 2:
                    System.out.println("Digite o nome do contato");
                    String nomeDeletar = scanner.next();
                    ag.deletarContato(nomeDeletar);
                    break;
                case 3:
                    if (ag.isEmpty()){
                        System.out.println("Agenda telefonica vazia");
                        break;
                    }
                    ag.listarContatos();
                    break;
                case 0:
                    System.out.println("Saindo da aplicação");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }


        } while (opcao != 0);

    }
}
