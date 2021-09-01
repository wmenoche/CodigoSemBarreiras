package conteudo01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eleitores, brancos, nulos, validos;
        double pBrancos, pNulos, pValidos;

        System.out.println("Informe o nro de eleitores:");
        eleitores = scanner.nextInt();
        System.out.println("Informe o nro de votos validos:");
        validos = scanner.nextInt();
        System.out.println("Informe o nro de votos em branco:");
        brancos = scanner.nextInt();
        System.out.println("Informe o nro de votos nulos:");
        nulos = scanner.nextInt();

        pValidos = ((double)validos / eleitores) * 100;
        pBrancos = ((double)brancos / eleitores) * 100;
        pNulos = ((double)nulos / eleitores) * 100;

        System.out.println("O numero de votos validos é:");
        System.out.println(pValidos);
        System.out.println("O numero de votos em branco é:");
        System.out.println(pBrancos);
        System.out.println("O numero de votos nulos é:");
        System.out.println(pNulos);


        scanner.close();
    }

}
