package academy.devdojo.maratonajava.introducao;
/**
    Prática

    Crie variáveis para os campos descritivos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>, 
    confirmo que recebi um salário de <salario>, na data <data>.

 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[]args){

        String nome = "Marcos";
        String endereco = "Rua Pedrinha - 2598";
        double salario = 15000;
        String data = "15 de Janeiro de 2022";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", ");
        System.out.println("confirmo que recebi um salário de R$"+salario+" na data "+data+".");

    }
}