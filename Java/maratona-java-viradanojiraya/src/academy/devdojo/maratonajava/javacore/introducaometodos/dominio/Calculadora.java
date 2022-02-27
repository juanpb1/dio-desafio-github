package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {
    
    public void somar(){
        System.out.println(10+10);
    }

    public void subtrair(){
        System.out.println(10-10);
    }

    //Método por parâmetro:
    public void multiplicar(int num1, int num2){
        System.out.println(num1*num2);
    }

    //Método com retorno:
    public double dividir(double num1, double num2){
        if(num2 == 0){
            return 0;
        }

        return num1/num2;
    }

    public void dividirVoid(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não é possível dividir um número por zero.");
            return;
        }

        System.out.println(num1/num2);
    }

    //Tipos primitivos 
    public void alterarValores(int numero1, int numero2){
        numero1 = 33;
        numero2 = 99;

        System.out.println("Dentro da classe:");
        System.out.println("Num1 "+numero1);
        System.out.println("Num1 "+numero2);
    }

    //Soma valores array#1:
    public void somaArray1(int[] numeros){
        int soma = 0;

        for(int i: numeros){
            soma += i;
        }

        System.out.println("Soma: "+soma);
    }

    //Soma valores array#2 Varargs:
    public void somaArray2(int... numeros){
        int soma = 0;
        for(int i: numeros){
            soma += i;
        }

        System.out.println("Soma: "+soma);
    }
}