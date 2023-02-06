package IndependentWork8.Ex3Forma;

public class Circulo extends Forma {
        private float raio;

    public Circulo(Position position, float raio) {
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
