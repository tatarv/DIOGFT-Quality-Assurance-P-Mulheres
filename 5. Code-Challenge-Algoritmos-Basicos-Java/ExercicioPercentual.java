import java.util.Scanner;

/*Desafio

O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! 
A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos.  */

public class ExercicioPercentual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


		System.out.println("Digite o valor total do produto:");
        int valorTotal = input.nextInt();

        System.out.println("Digite o valor do produto com desconto:");
        int valorFinal = input.nextInt();

        int resultado = valorTotal - valorFinal;

        int percentagem = (resultado*100) /valorTotal;
  
        System.out.println("O desconto foi de\t"+percentagem+"%" );
    }
}
