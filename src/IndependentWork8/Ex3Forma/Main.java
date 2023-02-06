package IndependentWork8.Ex3Forma;

public class Main {

    public static void main(String[] args) {

        Position p= new Position(0,0);

        Forma[] v = new Forma[5];
        v[0] = new Rectangulo(p,2,3);
        v[1] = new Circulo(p,5);
        v[2] = new Quadrado(p, 4);
        v[3] = new Rectangulo(p,5,4);
        v[4] = new Circulo(p,7);

        for (int i=0; i<v.length; i++){
            System.out.println("Area: " + v[i].calcularArea());
            System.out.println("Area: " + v[i].calcularPerimetro());
        }
    }
}
