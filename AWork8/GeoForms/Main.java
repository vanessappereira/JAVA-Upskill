package AWork8.GeoForms;

public class Main {

    public static void main(String[] args) {

        Position p= new Position(0,0);

        Form[] v = new Form[5];
        v[0] = new Rectangle(p,2,3);
        v[1] = new Circle(p,5);
        v[2] = new Square(p, 4);
        v[3] = new Rectangle(p,5,4);
        v[4] = new Circle(p,7);

        for (int i=0; i<v.length; i++){
            System.out.println("Area: " + v[i].calcularArea());
            System.out.println("Area: " + v[i].calcularPerimetro());
        }
    }
}
