package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;
import academy.devdojo.maratonajava.javacore.introducaoclasses.dominion.Animal;

public class AnimalTeste01 {
    public static void main(String [] args) {
        Animal gato = new Animal();
        
        gato.nome = "Xanin";
        gato.peso = 5.0;
        gato.sexo = 'M';

        System.out.println(gato.nome);
        System.out.println(gato.peso);
        System.out.println(gato.sexo);

    }
}