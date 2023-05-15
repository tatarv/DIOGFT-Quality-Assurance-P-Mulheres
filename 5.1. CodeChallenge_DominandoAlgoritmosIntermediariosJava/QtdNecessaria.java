import java.util.Scanner;

/* 
Desafio
Cada pizza é composta por 4 fatias. 
Há N amigos e cada amigo precisa de exatamente X fatias.
Você deverá criar um código capaz de calcular o número mínimo de pizzas 
Que eles devem pedir para satisfazer seu apetite.*/

public class QtdNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);
    
        int T = scanner.nextInt();
    
            // TODO: Retorne o número de pizzas necessárias para atender o pedido. 
             for (int i = 0; i < T; i++) {
               
                int numeroAmigos = scanner.nextInt();
                int fatiasPorAmigo = scanner.nextInt();
                
          
                int numeroMinimoPizzas = (int) Math.ceil((double) (numeroAmigos * fatiasPorAmigo) / SLICE);
                
                System.out.println(numeroMinimoPizzas);
            }
        }
    
    }

