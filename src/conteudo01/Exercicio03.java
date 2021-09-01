package conteudo01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a area do seu retangulo...");

            System.out.println("Digite o valor da base de seu retangulo:");

            double base = scanner.nextDouble();

                System.out.println("Digite o valor da altura de seu retangulo:");

                double altura = scanner.nextDouble();

                    System.out.println("A area do seu retangulo é::");
                    System.out.println(base * altura);

        scanner.close();
    }
}
