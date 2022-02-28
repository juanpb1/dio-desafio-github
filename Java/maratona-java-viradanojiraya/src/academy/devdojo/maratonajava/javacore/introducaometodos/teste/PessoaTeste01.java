package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa =  new Pessoa();

        pessoa.setNome("Thomas");
        pessoa.setIdade(35);

        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        
    }
}