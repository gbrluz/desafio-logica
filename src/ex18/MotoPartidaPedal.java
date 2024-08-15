package ex18;

public class MotoPartidaPedal extends Moto{
    private boolean aceleradorPuxado;

    public MotoPartidaPedal(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        aceleradorPuxado = false;
    }

    public void puxarAcelerador() {
        aceleradorPuxado = true;
        System.out.println("Acelerador puxado");
    }

    public void ligar() {
        if (aceleradorPuxado) {
            super.ligar();
        } else {
            System.out.println("Puxe o acelerador para ligar a moto");
        }
    }
}
