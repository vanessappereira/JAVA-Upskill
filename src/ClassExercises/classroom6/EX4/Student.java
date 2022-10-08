package Aula6Objectos.Aulas.EX4;

public class Student {
    private int numAluno;
    private String nome, curso;

    public Student(int numAluno, String nome, String curso){
        this.curso=curso;
        this.nome=nome;
        this.numAluno=numAluno;
    }

    public int getNumAluno() {
        return numAluno;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
}
