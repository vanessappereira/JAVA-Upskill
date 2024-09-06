package AWork8.GeoForms;

public class Rectangle extends Form {
        private float lado;
        private float altura;

    public Rectangle(Position position, float lado, float altura ) {
        super(position);
        this.altura=altura;
        this.lado=lado;
    }

    @Override
    public float calcularArea() {

        return lado*altura;
    }

    @Override
    public float calcularPerimetro() {

        return lado+lado+altura+altura;
    }
}
