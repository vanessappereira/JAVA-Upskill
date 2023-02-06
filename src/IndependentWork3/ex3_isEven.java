package IndependentWork3;

public class ex3_isEven {

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        boolean bool1 = isEven(5);
        System.out.println("The number is even? " + bool1);
    }
}
