package Veiculoo;

public class Veiculo {

    private String nome;

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Veiculo [nome='" + nome + "']";
    }
}
