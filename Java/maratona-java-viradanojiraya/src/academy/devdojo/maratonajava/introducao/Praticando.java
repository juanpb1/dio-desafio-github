package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Praticando {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        int n1;
        int n2;
        int resultado;

        System.out.println("Digite um número: ");
        n1 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        n2 = entrada.nextInt();
        
        System.out.println("RESULTADOS: ");
        resultado = n1+n2;
        System.out.println("Adição: " + resultado);
        resultado = n1-n2;
        System.out.println("Subtração: "+ resultado);
        resultado = n1*n2;
        System.out.println("Multiplicação: "+ resultado);
        resultado = n1/n2;
        System.out.println("Divisão: "+ resultado);
    }
}