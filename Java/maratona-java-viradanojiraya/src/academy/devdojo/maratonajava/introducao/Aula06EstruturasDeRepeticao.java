package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args){
        //while
        int count = 0;
        while(count < 10){
            System.out.println("While "+ ++count);
        }
        

        //Do-While
        count = 0;
        do{
            System.out.println("Do-While "+ ++count);
        }while(count < 10);

        
        //For
        for(int c=0;c <= 10;c++){
            System.out.println("For "+ c);
        }
    }
}