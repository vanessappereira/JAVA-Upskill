package ClassExercises.classroom3;

public class ex2 {
    public static void main(String[] args) {
        getTemperature(33);
    }
    public static void getTemperature(int temp){
        if (temp <= 0)
            System.out.println("Gelado");
        else if (temp >0 && temp <=15){
             System.out.println("Frio");
        }
        else if (temp >=50 && temp >=79){
            System.out.println("Quente");
        }
        else if (temp >=80){
             System.out.println("A Ferver");
        } else if (temp >15 &&  temp <=49) {
            System.out.println("Normal");
        }

}}