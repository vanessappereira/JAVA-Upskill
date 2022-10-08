package Aula11.exercicio2;

public class Rectangulo implements FiguraGeometricaPlana, FiguraGeometricaTridimensional {

    private int comp;
    private int larg;
    private String name;
    private int alt;


    public Rectangulo(int comp, int larg) {
        this.comp = comp;
        this.larg = larg;
        if (comp == larg) {
            name = "Quadrado";
        } else {
            name = "Rectangulo";
        }
    }

    public Rectangulo(int comp, int larg, int alt) {
        this.comp = comp;
        this.larg = larg;
        this.alt = alt;
        if (comp == larg && comp == alt) {
            name = "Cubo";
        } else {
            name = "Prisma";
        }

    }


    @Override
    public String getNomeFiguraPlana() {

        return name;
    }

    @Override
    public int getArea() {

        return comp * larg;
    }

    @Override
    public int getPerimetro() {

        return 2 * (comp + larg);
    }

    @Override
    public String getNomeFiguraTridimensinal() {

        return name;
    }

    @Override
    public int getAltura() {

        return alt;
    }

    @Override
    public int getVolume() {

        return getArea()*alt;
    }
}
