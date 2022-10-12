import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //converted();
        sumValuesArray();
    }

    ////////////////////////////////////////////
//1. Write a Java program to sort a numeric array and a string array.
    public static void converted() {
        int[] array1 = new int[]{1, 12, 58, 471, 25884, 47, 147, 3, 5, 0};
        String[] string1 = new String[]{"Java", "SQL", "UML", "JSP", "Alberto"};

        System.out.println("Original numeric array: " + Arrays.toString(array1));
        System.out.println("Original string array: " + Arrays.toString(string1));

        Arrays.sort(array1);
        Arrays.sort(string1);
        System.out.println("Sorted numeric array: " + Arrays.toString(array1));
        System.out.println("Sorted string array: " + Arrays.toString(string1));
    }

    ////////////////////////////////////////////
//2. Write a Java program to sum values of an array.
    public static void sumValuesArray() {
        int[] array2 = new int[]{1, 12, 58, 471, 25884, 47, 147, 3, 5, 0};
        int sum = 0;

        for (int t : array2) {
            sum = sum + t;
        }
        //Iniciar fora do ciclo for, caso esteja dentro, cada vez que soma, faz o sout
        System.out.println("O valor da soma do array é: " + sum);
    }
}
