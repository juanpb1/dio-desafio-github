package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        ImpressoraEstudante imprimirDados = new ImpressoraEstudante();

        estudante.nome = "Marcos";
        estudante.idade = 19;
        estudante.sexo = 'M';

        imprimirDados.imprimirEstudante(estudante);
    }
}