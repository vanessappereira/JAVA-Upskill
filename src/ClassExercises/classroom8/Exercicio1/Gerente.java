package Aula8ClasseAbstrata.Exercicio1;

public class Gerente extends Employee {
    public Gerente(String nome, String codFuncionario, double salariobase) {
        super(nome, codFuncionario, salariobase);
    }

    @Override
    public double calucularsalario() {

        return super.getSalariobase() * 2;
    }
}
