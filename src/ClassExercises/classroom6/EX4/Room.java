package ClassExercises.classroom6.EX4;

public class Room {
    private int capacidade, numSala;
    private char nomeBloco;
    private Student[] alunosnasala;

    public Room(int capacidade, int numsala, char nomeBloco) {
        this.capacidade = capacidade;
        this.numSala = numsala;
        this.nomeBloco = nomeBloco;
        alunosnasala = new Student[capacidade];
    }

    void AddStudent(Student S) {
        for (int i = 0; i < alunosnasala.length; i++) {
            if (alunosnasala[i] == null) {
                alunosnasala[i] = S;
                break;
            }
        }
    }

    void removeStudent(Student S) {
        for (int i = 0; i < alunosnasala.length; i++) {
            if (alunosnasala[i] != null) {
                if (alunosnasala[i].getNumAluno() == S.getNumAluno()) {
                    alunosnasala[i] = null;
                }
            }
        }
    }

}