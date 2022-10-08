package TA13;

public class carroOrcamento {
private String Carro;
private String Cliente;
private String Reparacao;
private int valor;

    public carroOrcamento(String carro, String cliente, String reparacao, int valor) {
        Carro = carro;
        Cliente = cliente;
        Reparacao = reparacao;
        this.valor = valor;
    }

    public String getCarro() {
        return Carro;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getReparacao() {
        return Reparacao;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "carroOrcamento{" +
                "Carro='" + Carro + '\'' +
                ", Cliente='" + Cliente + '\'' +
                ", Reparacao='" + Reparacao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
