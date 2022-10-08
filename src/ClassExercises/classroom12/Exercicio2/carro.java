package Aula12.Exercicio2;

public class carro {
    private String matricula;
    private String marca;
    private int anoVenda;


    public carro (String marca, String matricula, int anoVenda){
        this.marca = marca;
        this.matricula = matricula;
        this.anoVenda = anoVenda;
        }

    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public int getAnoVenda() {
        return anoVenda;
    }

    @Override
    public String toString() {
        return "Carro: " + "\n" +
                "Matricula: " + matricula + "\n" +
                "Marca: " + marca + "\n" +
                "Ano venda: " + anoVenda;
    }
}
