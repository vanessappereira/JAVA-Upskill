package Aula3Scanner.aulas;
import java.util.Scanner;
public class info {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Qual é o teu nome?");
        String name =keyboard.nextLine();
        System.out.println("Qual a idade?");
        int age = keyboard.nextInt();
        System.out.println("Ola "+ name + " tens " +age + " anos!");


    }
}
//arredondamento: System.out.printf("%.2f",