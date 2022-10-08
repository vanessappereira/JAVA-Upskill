package Aula13.Exercicio3;

public class ContaBancaria {
    private String descricao;
    private double valor;


    public ContaBancaria(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

}
