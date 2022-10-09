package ClassExercises.classroom11.exercicio4;

public class Livro {

    private String nome;
    private int ano;
    private String editora;
    private String autor;


    public Livro(String nome, int ano, String editora, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", editora='" + editora + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
