package ClasseseAtributos.Exercicio01;

    import java.time.LocalDate;

    class Pessoa {

        String nome;

        Integer anoDeNascimento;

        Float altura;


        void imprimiTodosOsDados() {
            System.out.printf("Nome: %s, Ano de Nascimento: %d, Altura: %.2f.%n",
                    this.nome,
                    this.anoDeNascimento,
                    this.altura);
        }

        void quantosAnosTereiNesseAno() {
            // var ano = 2021;
            var ano = LocalDate.now().getYear();
            System.out.println(ano - this.anoDeNascimento);
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", anoDeNascimento=" + anoDeNascimento +
                    ", altura=" + altura +
                    '}';
        }
    }


