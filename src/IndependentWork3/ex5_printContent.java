package IndependentWork3;

import java.util.Scanner;

public class ex5_printContent {
    public static String returnContent(String content) {
        System.out.println(content);
        return content;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Write content
        System.out.println("Please write your content:");
        String content = keyboard.nextLine();
        returnContent(content);
    }

}
