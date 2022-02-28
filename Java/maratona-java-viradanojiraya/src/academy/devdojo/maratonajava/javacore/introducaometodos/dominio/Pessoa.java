package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        if(nome == null || idade <= 0){
            System.out.println("Dados inválidos!");
            return;
        }
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //Set
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //Get
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return  this.idade;
    }

}