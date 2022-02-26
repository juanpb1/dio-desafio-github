package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        // Criando um Array
        String[] nomes = new String[3];

        nomes[0]="Marcos";
        nomes[1]="João";
        nomes[2]="Lucas";

        // Imprimindo o Array
        for(int i=0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }


        //Outra forma de cria Array
        int[] numeros = {1,2,3,4,5};

        //Outra forma de imprimir os valores de um array
        for(int num : numeros){
            System.out.println(num);
        }
    }
}