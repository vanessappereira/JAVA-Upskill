package ClassExercises.classroom7.Heranca;

public class Main {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor("Guilhermina", "123456789", 1);
        Employee employee = new Supervisor("Felisberto", "987654321", 1);
        System.out.println(supervisor);
        System.out.println(employee);
    }
}
