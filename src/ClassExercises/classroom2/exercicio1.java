package ClassExercises.classroom2;

public class exercicio1 {
//multiplicar os dois primeiros numeros e somar o terceiro

    public static int sumMult(int a, int b, int c){
        return (a+b)*c;
    }
    public static int sumMult2(int a, int b, int c){
        return (a*b)+c;
    }
    public static void main(String[] args) {

        System.out.println(sumMult(1,2,3));
        System.out.println(sumMult2(1,2,3));
    }
}