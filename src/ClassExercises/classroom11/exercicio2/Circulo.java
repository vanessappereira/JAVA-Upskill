package Aula11.exercicio2;

public class Circulo implements FiguraGeometricaPlana, FiguraGeometricaTridimensional {

    private int raio;
    private int altura;

    public Circulo(int raio) {

        this.raio = raio;
    }

    public Circulo(int raio, int altura) {
        this.raio = raio;
        this.altura = altura;
    }


    @Override
    public String getNomeFiguraPlana() {

        return "Circulo";
    }

    @Override
    public int getArea() {

        return (int) (Math.PI*raio*raio);
    }

    @Override
    public int getPerimetro() {

        return (int) (2*Math.PI*raio);
    }

    @Override
    public String getNomeFiguraTridimensinal() {

        return "Cilindro";
    }

    @Override
    public int getAltura() {

        return altura;
    }

    @Override
    public int getVolume() {

        return getArea()*altura;
    }
}
