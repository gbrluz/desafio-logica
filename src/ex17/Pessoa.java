package ex17;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public void exibirArvoreGenealogica() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if (pai != null) {
            System.out.println("Pai: " + pai.getNome());
        } else {
            System.out.println("Pai nulo");
        }

        if (mae != null) {
            System.out.println("Mae: " + mae.getNome());
        } else {
            System.out.println("Mae nulo");
        }

        System.out.println("_________________");

        if (pai != null) {
            pai.exibirArvoreGenealogica();
        }

        if (mae != null) {
            mae.exibirArvoreGenealogica();
        }
    }
}
