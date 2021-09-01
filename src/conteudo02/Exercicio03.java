package conteudo02;

import java.util.Scanner;

/*Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor. Escreva um algoritmo que determina o maior também*/

public class Exercicio03 {

            public static void main(String[] args) {

                Scanner in = new Scanner (System.in);

                    System.out.println("Digite o primeiro número:");
                    int numeroA = in.nextInt();

                    System.out.println("Digite o Segundo Numero:");
                    int numeroB = in.nextInt();

                    if(numeroA == numeroB) {
                    System.out.println("Os numeros são iguais");
                     }
                    else if(numeroA < numeroB) {
                    System.out.println("O numero B é Maior.");
                    }else {
                    System.out.println("O numero A é maior");
                    }


                in.close();
            }
}
