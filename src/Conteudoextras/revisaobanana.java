package Conteudoextras;

public class revisaobanana {


    public static void banana() {
        // para i = 0
        // até i < 10
        // i = i + 1

        String input = "Banana";

        for (int i = 0; i <= input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                int posicao;
                if (j + i > input.length() - 1) {
                    posicao = input.length() - i - j;

                    if (posicao < 0) {
                        posicao *= -1;
                    }

                } else {
                    posicao = j + i;
                }
                System.out.print(input.charAt(posicao));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        banana();
    }

}

