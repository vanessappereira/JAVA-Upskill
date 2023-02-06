package IndependentWork6.Exercicio1;

public class Musica {

    private String nome;
    private int duracao;

    public Musica(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
