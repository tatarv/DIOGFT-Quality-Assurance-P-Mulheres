import java.util.Scanner;

/*  
Desafio
Um número feliz é um número definido pelo seguinte processo:

• Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se n for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número n é feliz.*/

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean numeroFeliz = StatusNumero(n);
        System.out.println(numeroFeliz);
    
    }
    public static boolean StatusNumero(int n) {
        // Converte o número para uma string
        String num = String.valueOf(n);
        
        // Calcula a soma dos quadrados dos dígitos
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            sum += digit * digit;
        }
        if (sum == 1) {
            return true;
        } else if (sum == 4) {
      
            return false;
        } else {
            return StatusNumero(sum);
        }
    }
}

