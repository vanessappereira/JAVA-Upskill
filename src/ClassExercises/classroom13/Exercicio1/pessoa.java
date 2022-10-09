package ClassExercises.classroom13.Exercicio1;

public class pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "pessoas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
