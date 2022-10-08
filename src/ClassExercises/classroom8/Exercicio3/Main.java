package Aula8ClasseAbstrata.Exercicio3;

public class Main {
    public static void main(String[] args) {
        cartaoPresente aniversario = new Aniversario("a");
        cartaoPresente diaDosNamorados = new DiaDosNamorados("b");
        cartaoPresente natal = new Natal("c");

        aniversario.showMessage();
        diaDosNamorados.showMessage();
        natal.showMessage();
    }
}
