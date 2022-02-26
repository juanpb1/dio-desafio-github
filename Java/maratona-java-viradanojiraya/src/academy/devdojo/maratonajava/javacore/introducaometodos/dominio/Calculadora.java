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
}