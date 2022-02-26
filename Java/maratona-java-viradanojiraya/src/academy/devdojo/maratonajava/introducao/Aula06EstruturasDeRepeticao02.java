package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[]args){
        // Imprima os 25 valores de um dado valor.
        int valor = 50;
        for(int i=0; i < valor; i++){
            if(i <= 25){
                System.out.println(i);
            }else{
                break;
            }
        }
    }
}