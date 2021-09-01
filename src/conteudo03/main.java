package conteudo03;

import java.sql.SQLOutput;

public class main {

    public static void main(String[] args){
        int contagem = 1;

        while (contagem <= 10) {
            System.out.println(contagem);
            // contagem = contagem + 1;
            contagem++;
        }do {
            System.out.println(contagem);
            contagem++;
        } while (contagem <= 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
