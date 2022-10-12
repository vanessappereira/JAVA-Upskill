package independentWork8.ex3_shapes;

import independentWork8.ex3_shapes.code.*;

public class Program {
    public static void main(String[] args) {
        //Initial position
        position p = new position(0, 0);

        //Creating an array
        shape[] shapes = new shape[5];

        shapes[0] = new rectangle(p, 2, 3);
        shapes[1] = new circle(p, 5);
        shapes[2] = new square(p, 4);
        shapes[3] = new rectangle(p, 5, 4);
        shapes[4] = new circle(p, 7);

        //Run the array and print the information about the area and perimeter
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("The area is: " + shapes[i].calcArea());
            System.out.println("The perimeter is:" + shapes[i].calcPerimeter());
        }
    }
}