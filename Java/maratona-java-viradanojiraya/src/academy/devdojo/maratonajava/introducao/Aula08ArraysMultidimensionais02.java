package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        // Tipos de inicialização:
        // 1
        int[][] arrayNum1 = new int[3][];

        arrayNum1[0] = new int[2];
        arrayNum1[1] = new int[4];
        arrayNum1[2] = new int[] { 7, 8, 9, 10, 11, 12 };

        // 2
        int[][] arrayNum2 = { { 1, 2 }, { 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 } };

        System.out.println("=Array1:");
        for(int[] arrayB1:arrayNum1){
            for(int num:arrayB1){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        System.out.println("=Array2:");
        for(int[] arrayB2:arrayNum2){
            for(int num:arrayB2){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}