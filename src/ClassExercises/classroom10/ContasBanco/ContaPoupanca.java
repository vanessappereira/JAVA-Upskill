package Aula10Trabalhos.ContasBanco;

public class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    public ContaPoupanca(String senha, String numeroConta, double saldo, double taxaRendimento) {
        super(senha, numeroConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void levanta(double valor) {
        if(getSaldo() - valor - calculaRendimento() >= 0){
            setSaldo(getSaldo() - valor - calculaRendimento());
        } else {
            System.out.println("Fundos insuficientes.");
        }
    }

    @Override
    public void deposita(double valor) {
        setSaldo(getSaldo()+valor);
    }

    public double calculaRendimento(){
        //..
        return 0.0;
    }

    @Override
    public void tiraExtrato() {
        System.out.println("Saldo atual: " + getSaldo() + getSaldo()*taxaRendimento);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

}

