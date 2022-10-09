package ClassExercises.classroom7.Exercicio2Ingressos;
/*
classe
CamaroteSuperior, que é mais cara (possui valor adicional). Esta última possui
um método para retornar o valor do ingresso. Ambos os camarotes devem
herdar as características dos Ingressos VIP.
 */
public class CamaroteSup extends VIP {
    private int valorAdicionalCamaroteSup ;

    public CamaroteSup(int valor, int valorAdicionalVIP, int valorAdicionalCamaroteSup) {
        super(valor, valorAdicionalVIP);
        this.valorAdicionalCamaroteSup = valorAdicionalCamaroteSup;
    }
    @Override
    public int imprimirValor() {
        int valor = super.imprimirValor() + this.valorAdicionalCamaroteSup;
        System.out.println("O valor é: " + valor);
        return valor;
    }
}
