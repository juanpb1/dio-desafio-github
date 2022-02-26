package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean

        int idade = 19;
        long numeroGrande = 1000000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 18;
        short idadeShort = 18;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        //String não é um tipo primitivo é uma class.
        String nome = "Juan";
        
        System.out.println("Meu nome é "+ nome +" e tenho "+ idade +" anos.");
    }
}