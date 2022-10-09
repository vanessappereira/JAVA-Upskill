package ClassExercises.classroom10.ContasBanco;

public class ContaCorrente extends ContaBancaria {

    private int qtdTransacções;

    public ContaCorrente(String senha, String numeroConta, double saldo) {
        super(senha, numeroConta, saldo);
        this.qtdTransacções = 0;
    }

    @Override
    public void levanta(double valor) {
        if(getSaldo() - valor >= 0){
            setSaldo(getSaldo()-valor);
            qtdTransacções++;
        } else {
            System.out.println("Fundos insuficientes.");
        }
    }

    @Override
    public void deposita(double valor) {
        setSaldo(getSaldo()+valor);
        qtdTransacções++;
    }

    @Override
    public void tiraExtrato() {
        System.out.println("Saldo atual: " + getSaldo());
    }

    public int getQtdTransacções() {
        return qtdTransacções;
    }
}