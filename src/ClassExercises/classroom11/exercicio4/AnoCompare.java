package ClassExercises.classroom11.exercicio4;


import java.util.Comparator;

public class AnoCompare implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        if (o1.getAno() > o2.getAno()) {
            return -1;
        } else if (o1.getAno() < o2.getAno()){
            return 1;
        } else{
            return 0;
        }
    }
}
