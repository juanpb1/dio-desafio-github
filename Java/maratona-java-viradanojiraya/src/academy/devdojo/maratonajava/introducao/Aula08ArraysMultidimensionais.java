package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args){
        //Criando um Array Multidimensional
        int[][] matriz = new int[3][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        System.out.println("==SEM FOREACH");
        for(int l=0; l < matriz.length;l++){
            for(int c=0;c < matriz[l].length;c++){
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println("");
        }

        System.out.println("==COM FOREACH");
        for(int[]arryBase:matriz){
            for(int num:arryBase){
                System.out.print(num+" ");
            }
            System.out.println("");
        }
    }
}