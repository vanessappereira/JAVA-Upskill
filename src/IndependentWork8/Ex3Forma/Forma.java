package IndependentWork8.Ex3Forma;

public abstract class Forma {
    private Position position;

    public Forma(Position position){

        this.position=position;
    }

    public Position getPosition() {

        return position;
    }
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
}
