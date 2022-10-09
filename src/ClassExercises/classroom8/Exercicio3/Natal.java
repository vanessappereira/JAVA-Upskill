package ClassExercises.classroom8.Exercicio3;

public class Natal extends cartaoPresente{
    public Natal(String destinatario) {
        super(destinatario);
    }
    @Override
    public void showMessage() {
        System.out.println("Feliz Natal" + super.getDestinatario());

    }
}
