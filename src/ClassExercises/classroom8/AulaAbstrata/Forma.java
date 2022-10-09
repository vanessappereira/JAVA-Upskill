package ClassExercises.classroom8.AulaAbstrata;

public abstract class Forma {
    private Position position;

    public Forma(Position position){
        this.position=position;
    }

    public Position getPosition() {
        return position;
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
