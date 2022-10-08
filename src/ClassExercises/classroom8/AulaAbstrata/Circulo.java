package Aula8ClasseAbstrata.AulaAbstrata;

public class Circulo extends Forma {
        private double raio;

    public Circulo(Position position, double raio) {
        super(position);
        this.raio=raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*raio*2;
    }
}
