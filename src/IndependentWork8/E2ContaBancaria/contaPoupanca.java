package IndependentWork8.E2ContaBancaria;

public class contaPoupanca extends contaBancaria{

    private double saldo;
    private int txRendimento;

    public contaPoupanca(int numero, String password) {
        super(numero, password);
        this.saldo=saldo;
        this.txRendimento=txRendimento;
    }

    @Override
    public double levanta() {
        return saldo-txRendimento;
    }

    @Override
    public double deposita() {
        return saldo+txRendimento;
    }


}
