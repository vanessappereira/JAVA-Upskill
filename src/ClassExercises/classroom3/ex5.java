package Aula3Scanner.aulas;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Qual o primeiro numero?");
        int valor1 = keyboard.nextInt();
        System.out.println("Qual o segundo numero?");
        int valor2 = keyboard.nextInt();
        System.out.println("Qual o terceiro numero?");
        int valor3 = keyboard.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O valor maior e: " + valor1);
        }
        if (valor2 > valor3 && valor2 > valor1){
            System.out.println("O valor maior e: " + valor2);
        if (valor3 > valor1 && valor3 > valor2){
            System.out.println("O valor maior e: " + valor3);
        }
        }
}
}