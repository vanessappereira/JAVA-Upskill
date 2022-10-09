package ClassExercises.classroom10.ContasBanco;

import java.util.Scanner;

public abstract class ContaBancaria {

    private String senha;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String senha, String numeroConta, double saldo) {
        this.senha = senha;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void alteraSenha(String novaSenha) {
        System.out.println("Insira a senha atual:");
        Scanner s = new Scanner(System.in);
        String senhaAntiga = s.next();
        if (senhaAntiga.equals(senha)) {
            senha = novaSenha;
        }
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void levanta(double valor);

    public abstract void deposita(double valor);

    public abstract void tiraExtrato();
}
