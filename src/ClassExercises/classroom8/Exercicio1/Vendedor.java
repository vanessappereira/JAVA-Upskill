package ClassExercises.classroom8.Exercicio1;

public class Vendedor extends Employee{

    private double comissao;

    public Vendedor(String nome, String codFuncionario, double salariobase) {
        super(nome, codFuncionario, salariobase);
        this.comissao= comissao;
    }

    @Override
    public double calucularsalario() {

        return super.getSalariobase()+comissao;
    }
}
