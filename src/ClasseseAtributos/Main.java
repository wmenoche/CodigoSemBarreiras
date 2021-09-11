package ClasseseAtributos;

public class Main {

    public static void main(String[] args) {
        var pessoa = new Pessoa();
        pessoa.altura = 1.80f;
        pessoa.anoDeNascimento = 1990;
        pessoa.nome = "Anderson Rocha";
        System.out.println(pessoa);
        pessoa.imprimiTodosOsDados();
        pessoa.quantosAnosTereiNesseAno();
    }


}