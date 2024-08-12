package ex16;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Pessoa pessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Pessoa pessoa, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirEmprestimo() {
        System.out.println("Emprestimo do livro: " + livro.getTitulo());
        System.out.println("Emprestado para: " + pessoa.getNome());
        System.out.println("Data de emprestimo: " + dataEmprestimo);
        System.out.println("Data de devolucao: " + dataDevolucao);
        System.out.println();
    }
}
