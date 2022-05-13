package Practica5;


public class Calculadora implements ICalculadora {

    public static void main(String[] args) {
        
    }

    @Override
    public double sumar(double x, double y) {
        double resultado = 0;
        resultado = x + y;
        return resultado;
    }

    @Override
    public double restar(double x, double y) {
        double resultado = 0;
        resultado = x - y;
        return resultado;
    }

    @Override
    public double multiplicar(double x, double y) {
        double resultado = 0;
        resultado = x * y;
        return resultado;
    }

    @Override
    public double dividir(double x, double y) {
        double resultado = 0;
        resultado = x / y;
        return resultado;
    }

}
