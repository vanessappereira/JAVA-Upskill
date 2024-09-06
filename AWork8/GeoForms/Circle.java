package AWork8.GeoForms;

public class Circle extends Forma {
        private float raio;

    public Circle(Position position, float raio) {
        super(position);
        this.raio=raio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI*raio*raio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (Math.PI*raio*2);
    }
}
