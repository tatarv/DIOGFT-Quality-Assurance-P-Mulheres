import java.util.Scanner;

/* 
Desafio

Elabore um programa que simule uma fila de atendimento bancário. 
O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.*/

public class ExercicioFilaBanco {
    public static void main(String[] args) {
        String[] nomesFila = new String[4]; 
        Scanner scanner = new Scanner(System.in); 


        for (int i = 1; i < 4; i++) {
            nomesFila[i] = scanner.next();
            System.out.println(nomesFila[i]+"\testa na posição:"+i);
          }
    }
}
