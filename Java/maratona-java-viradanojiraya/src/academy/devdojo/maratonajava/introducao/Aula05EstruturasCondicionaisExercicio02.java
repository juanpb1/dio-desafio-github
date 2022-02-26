package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio02 {
    public static void main(String []args){
        //Dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        //Considerando 1 como domingo.
        
        int dia = 6;

        if(dia >= 2 && dia <= 6){
            System.out.println("Dia útil.");
        }else{
            System.out.println("Final de semana.");
        }

        switch (dia) {
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda.");
                break;
            case 3:
                System.out.println("Terça.");
                break;
            case 4:
                System.out.println("Quarta.");
                break;
            case 5:
                System.out.println("Quinta.");
                break;
            case 6:
                System.out.println("Sexta.");
                break;
            case 7:
                System.out.println("Sabádo.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}