package ex18;

public class CarroAutomatico extends Carro{
    private boolean freioPressionado;

    public CarroAutomatico(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.freioPressionado = false;
    }

    public void pressionarFreio() {
        this.freioPressionado = true;
        System.out.println("Freio Pressionado");
    }

    public void ligar() {
        if (freioPressionado) {
            super.ligar();
        } else {
            System.out.println("Pressione o freio para ligar o carro");
        }
    }
}
