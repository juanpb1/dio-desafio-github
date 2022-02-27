package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario pessoa1 = new Funcionario();

        pessoa1.nome = "Carlos";
        pessoa1.idade = 32;
        pessoa1.salarios = new double[]{6580.00, 7000, 6800};

        pessoa1.imprime();
    }
}