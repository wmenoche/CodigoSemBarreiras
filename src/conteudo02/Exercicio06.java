package conteudo02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        int v1,v2;

        System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
        System.out.println("Pedra = 0 ");
        System.out.println("Papel = 1  ");
        System.out.println("Tesoura = 2");

        System.out.println("Jogador 1: ");
        v1 = sc.nextInt();

        System.out.println("Jogador 2: ");
        v2 = sc.nextInt();

        switch (v1){
            case 0:
                switch (v2){
                    case 0:
                        System.out.println("Empate");
                        break;
                    case 1:
                        System.out.println("Jogador 2 ganhou");
                        break;
                    case 2:
                        System.out.println("Jogador 1 ganhou");
                        break;
                    default:
                        System.out.println ("USUARIO BURRO DO CARALHO");
                } break;
            case 1:
                switch(v2) {
                    case 0:
                        System.out.println("Jogador 1 ganhou");
                        break;
                    case 1:
                        System.out.println(" Empatou");
                        break;
                    case 2:
                        System.out.println("Jogador 2 ganhou");
                        break;
                    default:
                        System.out.println ("USUARIO BURRO DO CARALHO");
                } break;
            case 2:
                switch(v2) {
                    case 0:
                        System.out.println("Jogador 2 ganhou");
                        break;
                    case 1:
                        System.out.println("Jogador 1 ganhou");
                        break;
                    case 2:
                        System.out.println("Empate");
                        break;
                    default:
                        System.out.println ("USUARIO BURRO DO CARALHO");
                } break;
            default:
                System.out.println ("USUARIO BURRO DO CARALHO");
        }
    }
}
