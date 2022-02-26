package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args){


        //Usando if-else: 
        int idade1 = 18;
        String categoria = "";

        if(idade1 < 12){
            categoria = "Categoria Infantil";
        }else if(idade1 >= 12 && idade1 <= 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);

        
        //Usando operador ternário:

        int idade2 = 19;
        String isMaior = idade2 >= 18 ? "É maior." : "É menor.";
        
        System.out.println(isMaior);
    }
}