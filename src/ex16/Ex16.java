package ex16;

import java.time.LocalDate;

public class Ex16 {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro 1", "autor1");
        Livro livro2 = new Livro("Livro 2", "autor2");

        Pessoa pessoa1 = new Pessoa("Gabriel");
        Pessoa pessoa2 = new Pessoa("Henrique");

        Emprestimo emprestimo1 = new Emprestimo(livro1,pessoa1, LocalDate.now(),LocalDate.now().plusDays(5));
        Emprestimo emprestimo2 = new Emprestimo(livro2,pessoa2, LocalDate.now(),LocalDate.now().plusDays(18));

        emprestimo1.exibirEmprestimo();
        emprestimo2.exibirEmprestimo();
    }

}
