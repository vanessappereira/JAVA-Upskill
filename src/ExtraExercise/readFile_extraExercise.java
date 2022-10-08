package ExtraExercise;

import java.io.FileReader;
import java.io.Reader;

public class readFile_extraExercise {
    public static void main(String[] args) {

        //Create an array of char
        char[] array = new char[50];
        try {
            //Create a reader using the FileReader
            Reader input = new FileReader("src/ExtraExercise.List/sample.txt");

            //Checks if reader is ready
            System.out.println("Is there any data in the file? " + input.ready());

            //Read chars
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);

            //Close reader
            input.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
