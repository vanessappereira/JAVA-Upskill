package Aula7HerancaPolimorfismo.Exercicio2Ingressos;
/*
Crie uma classe VIP, que herda de Ingresso e possui um valor adicional. Crie um
método que retorne o valor do ingresso VIP (com o adicional incluído).
 */
public class VIP extends Ingresso{
    private int valorAdicionalVIP;
    public VIP(int valor, int valorAdicionalVIP){
        super(valor);
        this.valorAdicionalVIP=valorAdicionalVIP;
    }
    @Override
    public int imprimirValor() {
        int valor = super.imprimirValor() + this.valorAdicionalVIP;
        System.out.println("O valor é: " + valor);
        return valor;
    }
}
