package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora alteraValores = new Calculadora();

        int a = 1;
        int b = 2;

        alteraValores.alterarValores(a, b);

        System.out.println("Dentro do main: ");
        System.out.println("Num1 "+a);
        System.out.println("Num2 "+b);
    }
}