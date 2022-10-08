package Aula11.exercicio3;


public class Filme implements Comparable<Filme> {

    private int pontuacao;
    private String nome;
    private int ano;

    public Filme(int pontuacao, String nome, int ano) {
        this.pontuacao = pontuacao;
        this.nome = nome;
        this.ano = ano;
    }

    public int getAno() {

        return ano;
    }

    public int getPontuacao() {

        return pontuacao;
    }

    @Override
    public String toString() {
        return "Filme: " +
                "pontuacao: " + pontuacao +
                ", nome: " + nome + '\'' +
                ", ano: " + ano;
    }

    @Override
    public int compareTo(Filme o) {
      /*  if (ano == o.getAno()) {
            return 0;
        } else if (ano > o.getAno()) {
            return 1;
        } else {
            return -1;
        }
        */
        if (pontuacao == o.getPontuacao()) {
            return 0;
        } else if (pontuacao > o.getPontuacao()) {
            return -1;
        } else {
            return 1;
        }

    }
}
