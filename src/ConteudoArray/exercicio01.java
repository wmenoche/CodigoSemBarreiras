package ConteudoArray;
//Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.

//Shift +F6 = clica na variavel e altera todas as variaveis

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class exercicio1 {

    public static void comLista() {
        // Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.


        // Usando o try, vc não precisa fechar o scanner manualmente.
        // Essa técnica se chama try with resources.
        try (Scanner in = new Scanner(System.in)) {
            var programaDeveContinuarExecutando = true;

            var numeros = new ArrayList<Integer>();

            while (programaDeveContinuarExecutando) {
                System.out.println("Digite um novo número");
                numeros.add(in.nextInt());

                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (in.next().charAt(0) == 'n') {
                    programaDeveContinuarExecutando = false;
                }
            }

            System.out.println(numeros);
        }


    }

    public static void comArray() {
        // Escreva um algoritmo que leia números insira em um array e após mostre os números informados na tela.


        // Usando o try, vc não precisa fechar o scanner manualmente.
        // Essa técnica se chama try with resources.
        try (Scanner in = new Scanner(System.in)) {
            var programaDeveContinuarExecutando = true;
            var indice = 0;

            var numeros = new Integer[10];

            while (programaDeveContinuarExecutando && indice < 10) {
                System.out.println("Digite um novo número");
                numeros[indice] = in.nextInt();

                System.out.println("Deseja adicionar mais um número? [s], [n]");
                if (in.next().charAt(0) == 'n') {
                    programaDeveContinuarExecutando = false;
                }
                indice++;
            }

            for (Integer item: numeros) {
                if (item != null) {
                    System.out.print(item + " ");
                }
            }
            System.out.println("");
        }


    }

    public static void main(String[] args) {
        // comLista();
        comArray();
    }

}