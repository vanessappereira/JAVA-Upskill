package ClassExercises.classroom7.Exercicio1Empregados;
/*
Empregados: valor fixo de 800€;
 */
public class Empregado {
    private int salario=800;
    private String nome;
    public Empregado(String nome){
        this.nome=nome;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
