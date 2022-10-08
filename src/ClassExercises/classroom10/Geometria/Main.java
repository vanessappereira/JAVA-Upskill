package Aula10Trabalhos.Geometria;
public class Main {

    public static void main(String[] args) {
        Forma[] formas = new Forma[5];
        formas[0] = new Retangulo(5,10);
        formas[1] = new Circulo(4);
        formas[2] = new Quadrado(3);
        formas[3] = new Retangulo(4,6);
        formas[4] = new Circulo(2);
        for(int i = 0; i<formas.length; i++){
            System.out.println("Forma "+i+": perimetro=" + formas[i].calcularPerimetro() + ", area=" + formas[i].calcularArea());
        }
    }

}
