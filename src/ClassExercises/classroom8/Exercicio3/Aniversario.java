package Aula8ClasseAbstrata.Exercicio3;

public class Aniversario extends cartaoPresente{
    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Happy B'day!" + super.getDestinatario());
    }
}
