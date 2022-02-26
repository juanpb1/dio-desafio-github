package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String [] args){
        //Desenvolver um programa que calcule o imposto a ser pago.
        double imposto, salario = 70000;

        if(salario <= 34712){
            imposto = (salario * 9.7) / 100; // salario * 0.097
        }else if(salario >=34713 && salario <= 68507){
            imposto = (salario * 37.35) / 100; //salario * 0.3735;
        }else{
            imposto = (salario * 49.50) / 100; //salario * 0.4950;
        }

        System.out.println(imposto);
    }   
}