package IndependentWork8.Ex3Forma;

public class Rectangulo extends Forma {
        private float lado;
        private float altura;

    public Rectangulo(Position position, float lado, float altura ) {
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
