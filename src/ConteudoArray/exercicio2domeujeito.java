package ConteudoArray;

import java.util.Scanner;

public class exercicio2domeujeito {

    public static void main(String[] args){
        int[] numero = new int[10];
        Scanner entrada = new Scanner(System.in);

        //recebendo os números
        for(int indice=0 ; indice < 10 ; indice++){
            System.out.print("\nEntre com o número " + (indice+1) + ": ");
            numero[indice] = entrada.nextInt();
        }

        //exibindo os números
        for(int indice=0 ; indice < 10 ; indice++){
            if (numero[indice] < 0)
                System.out.printf("O Número armazenado na posição %d é negativo-> %d\n",indice+1,numero[indice]);

        }
    }


}
