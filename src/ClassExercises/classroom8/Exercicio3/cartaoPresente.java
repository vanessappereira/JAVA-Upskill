package Aula8ClasseAbstrata.Exercicio3;

public abstract class cartaoPresente {
    private String destinatario;

    public cartaoPresente(String destinatario) {
        this.destinatario=destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }
    public abstract void showMessage();
}
