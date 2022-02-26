package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominion.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro00 = new Carro();
        Carro carro01 = new Carro();

        carro00.nome = "Celta";
        carro00.modelo = "Spirit";
        carro00.ano = 2002;

        carro01.nome = "Corsa";
        carro01.modelo = "GL";
        carro01.ano = 2002;

        System.out.println("Nome: " + carro00.nome + "| Modelo: " + carro00.modelo + "| Ano: " + carro00.ano);
        System.out.println("Nome: " + carro01.nome + "| Modelo: " + carro01.modelo + "| Ano: " + carro01.ano);

    }
}