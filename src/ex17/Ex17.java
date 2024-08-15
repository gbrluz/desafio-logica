package ex17;

public class Ex17 {
    public static void main(String[] args) {
        Pessoa avoMaterna = new Pessoa("Luiza",88,null,null);
        Pessoa avoPaterno = new Pessoa("Mario",88,null,null);
        Pessoa pai = new Pessoa("Marcos",44,avoPaterno,null);
        Pessoa mae = new Pessoa("Julia",44,null,avoMaterna);
        Pessoa filho = new Pessoa("Enzo",22,pai,mae);

        filho.exibirArvoreGenealogica();
    }
}
