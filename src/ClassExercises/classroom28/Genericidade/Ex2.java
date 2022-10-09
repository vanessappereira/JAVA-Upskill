package ClassExercises.classroom28.Genericidade;

public class Ex2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Ola", 4);
        Pair<Integer, Boolean> pair2 = new Pair<>(3,false);

        pair1.getKey();
        pair2.getValue();
    }
}
