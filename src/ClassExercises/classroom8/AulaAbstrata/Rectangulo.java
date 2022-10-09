package ClassExercises.classroom8.AulaAbstrata;

public class Rectangulo extends Forma{
        private double lado;
        private double altura;

    public Rectangulo(Position position,double lado, double altura ) {
        super(position);
        this.altura=altura;
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return lado*altura;
    }

    @Override
    public double calcularPerimetro() {
        return lado+lado+altura+altura;
    }
}
