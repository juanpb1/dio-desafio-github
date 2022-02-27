package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        if(nome == null || idade == 0 || salarios == null){
            System.out.println("Dados incompletos!");
            return;
        }

        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        for (double salario: salarios) {
            System.out.println(" R$"+salario);
        }
        mediaSalarial();
    }

    public void mediaSalarial(){
        double mediaSalarial = 0;

        for (double salario: salarios) {
            mediaSalarial += salario;
        }

        System.out.println("Média Salarial: R$"+mediaSalarial/salarios.length);
    }
}