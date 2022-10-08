package IndependentWork2;

//área de um prisma retangular, dando a sua largura, altura e comprimento
public class ex12 {
    public static void areaPrism(int largura, int altura, int comprimento) {
        int areaprisma = 2 * (largura * comprimento) + 4 * (comprimento * altura);
        System.out.println("The prism area is: " + areaprisma);
    }

    public static void main(String[] args) {
        areaPrism(8, 10, 15);
    }
}
