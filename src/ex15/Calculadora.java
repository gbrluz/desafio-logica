package ex15;

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double soma (double num1, double num2) {
        return num1 + num2;
    }
    public double subtracao (double num1, double num2) {
        return num1 - num2;
    }
    public double multiplicacao (double num1, double num2) {
        return num1 * num2;
    }
    public double divisao (double num1, double num2) {
        return num1 / num2;
    }
    public double potencia (double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
