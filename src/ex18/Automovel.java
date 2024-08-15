package ex18;

public class Automovel {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Automovel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Automovel ligado");
        } else {
            System.out.println("Automovel já está ligado");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Automovel desligado");
        } else {
            System.out.println("Automovel já está desligado");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
