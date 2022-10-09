package ClassExercises.classroom8.Exercicio1;

public class Assistente extends Employee{
    public Assistente(String nome, String codFuncionario, double salariobase) {
        super(nome, codFuncionario, salariobase);
    }
    @Override
    public double calucularsalario() {
        return super.getSalariobase();
    }
}
