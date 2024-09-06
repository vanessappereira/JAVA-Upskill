package AWork8.GeoForms;

public abstract class Form {
    private Position position;

    public Form(Position position){

        this.position=position;
    }

    public Position getPosition() {

        return position;
    }
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
}
