package Aula3Scanner.aulas;
import java.util.Scanner;
public class ex4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Qual o numero?");
        int valor = keyboard.nextInt();

        if (valor >=1)
            System.out.println("O numero e positivo");
        if (valor == 0)
            System.out.println("O numero e zero");
        if (valor <0 )
            System.out.println("O numero e negativo");
    }
}
