import java.util.Scanner;

/* Desafio
O desafio consiste em um número inteiro n, onde será necessário 
calcular a diferença entre o produto e a soma dos seus digitos.
*/

public class DiferencaDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int produto = 1;
        int soma = 0;
      
      // Obtém cada dígito do número
      String digits = String.valueOf(numero);
      for (int i = 0; i < digits.length(); i++) {
          int digit = Character.getNumericValue(digits.charAt(i));
          produto *= digit;
          soma += digit;
      }
    
      int diferenca = produto - soma;
      
      System.out.println(diferenca);
  }
    }

