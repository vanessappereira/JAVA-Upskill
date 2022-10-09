package ClassExercises.classroom12.Exercicio1;

public class contacto {
    private String nome;
    private String nrTelefone;
    private String eMail;

    public contacto(String nome, String eMail, String nrTelefone){
        this.nome=nome;
        this.eMail=eMail;
        this.nrTelefone=nrTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public String geteMail() {
        return eMail;
    }

    @Override
    public String toString() {
        return "contacto: " + "\n" +
                "nome: " + nome + "\n" +
                "numero de telefone: " + nrTelefone + "\n" +
                "eMail: " + eMail ;
    }
}
