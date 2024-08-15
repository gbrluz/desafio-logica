package ex18;

public class Guincho extends Automovel {
    public Guincho(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void carregar (Automovel automovel) {
        System.out.println("Carregando " + automovel.getMarca() + " " + automovel.getModelo() + " " + automovel.getAno() + " " + "com o guincho");
    }
}
