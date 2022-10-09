package ClassExercises.classroom8.Exercicio1;

public abstract class Employee {
    private String nome;
    private String codFuncionario;
    private double salariobase = 800;

    public Employee(String nome, String codFuncionario, double salariobase){
        this.nome=nome;
        this.codFuncionario=codFuncionario;
    }

    public String getNome() {

        return nome;
    }

    public String getCodFuncionario() {
        return
                codFuncionario;
    }

    public double getSalariobase() {

        return salariobase;
    }

    public void setSalariobase(double salariobase) {

        this.salariobase = salariobase;
    }

    public abstract double calucularsalario();
}
