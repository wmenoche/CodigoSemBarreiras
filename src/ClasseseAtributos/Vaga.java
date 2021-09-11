package ClasseseAtributos;

class Vaga {

    String setor;
    int numero;
    boolean ocupada;
    float largura;
    // Cliente cliente;

    Vaga() {

    }

    Vaga(boolean estaOcupada) {
        this.ocupada = estaOcupada;
    }

    void setSetor(String setor) {
        this.setor = setor;
    }

    String getSetor() {
        return this.setor;
    }

    boolean estaOcupada() {
        return this.ocupada;
    }

    @Override
    public String toString() {
        return "Vaga{" +
                "setor='" + setor + '\'' +
                ", numero=" + numero +
                ", ocupada=" + ocupada +
                ", largura=" + largura +
                '}';
    }
}