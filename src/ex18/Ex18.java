package ex18;

public class Ex18 {
    public static void main(String[] args) {
        CarroAutomatico carro = new CarroAutomatico("Toyota", "Corolla", 2019);
        carro.ligar();
        carro.pressionarFreio();
        carro.ligar();

        MotoPartidaPedal moto = new MotoPartidaPedal("Yamaha", "CG 125", 2018);
        moto.ligar();
        moto.puxarAcelerador();
        moto.ligar();

        Guincho guincho = new Guincho("Volvo","Guincho",2012);
        guincho.carregar(carro);
        guincho.carregar(moto);



    }
}
