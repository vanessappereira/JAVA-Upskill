package IndependentWork8.E2ContaBancaria;

public class contaCorrente extends contaBancaria{

    private double saldo;
    private int qtdTransacoes;

    public contaCorrente(int numero, String password) {
        super(numero, password);
        this.qtdTransacoes=qtdTransacoes;
        this.saldo = saldo;
    }

    @Override
    public double levanta() {
        return saldo;
    }

    @Override
    public double deposita() {
        return 0;
    }


    public double getSaldo() {
        return saldo;
    }

    public int getQtdTransacoes() {
        return qtdTransacoes;
    }
}
