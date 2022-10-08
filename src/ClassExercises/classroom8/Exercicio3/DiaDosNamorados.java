package Aula8ClasseAbstrata.Exercicio3;

public class DiaDosNamorados extends cartaoPresente{

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("I Love You" + super.getDestinatario());

    }
}
