package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Ronaldo";
        estudante.idade = 26;
        estudante.sexo = 'M';

        estudante.imprime();
    }
}