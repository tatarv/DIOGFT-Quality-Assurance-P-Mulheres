import java.util.Scanner;

/* 
Desafio

Faça um programa que peça para 3 pessoas a sua idade, 
ao final o programa deverá verificar se a média de idade da turma varia entre 0 e 25, 
26 e 60 e maior que 60; e então, dizer se a turma é jovem, 
adulta ou idosa, conforme a média calculada. */

public class ExercicioMedia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade1, idade2, idade3, media, soma;

        System.out.println("Por favor informe a primeira idade:");
        idade1 = scanner.nextInt();
        System.out.println("Por favor informe a segunda idade:");
        idade2 = scanner.nextInt();
        System.out.println("Por favor informe a terceira idade:");
        idade3 = scanner.nextInt();

        soma = idade1+idade2+idade3;
        media = soma/3;

        if(media >=0 && media <=25){
            System.out.println("A média é: "+media);
            System.out.println("Jovem!");
        }else if (media >=26 && media <=60){
           System.out.println("A média é: "+media);
           System.out.println("Adulta!");     
        }else{
            System.out.println("A média é: "+media);
            System.out.println("Idosa!");
        }
    }   
}