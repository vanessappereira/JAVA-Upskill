package IndependentWork6.Exercicio2;

public class Main {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.soma(1, 4);
        c.divisao(7, 1);
        c.potencia(2, 4);
        c.formulaResolvente(1, 2, 3);
        c.subtracao(4, 1);
        c.restoDiv(2, 2);

        c.imprimirUltimas5operacoes();

    }

}
