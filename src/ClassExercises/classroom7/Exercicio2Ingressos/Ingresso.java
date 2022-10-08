package Aula7HerancaPolimorfismo.Exercicio2Ingressos;

public class Ingresso extends Object{
    private int valor;
    public Ingresso(int valor){
        this.valor=valor;
    }
    public int imprimirValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Ingresso: " + "valor=" + valor;
    }
}
