package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //Forma 1 de calcular valores de um array:
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray1(numeros);

        //Forma 2 de calcular valores de um array
        calculadora.somaArray2(1,2,3,4,5);
    }
}