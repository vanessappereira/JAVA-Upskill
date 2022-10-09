package ClassExercises.classroom2;

//Função que retorne a area de um circulo com raio r expressão Math.PI area=Pir2
public class exercicio2 {

    public static double circleArea(int r){
        //return Math.PI*Math.pow(r,2);
        return Math.PI*(r*r);
    }
    public static void main(String[] args) {
        System.out.println("A area do circulo:");
        System.out.println(circleArea(2));
    }
}