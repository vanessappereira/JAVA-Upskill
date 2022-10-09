package ClassExercises.classroom12.Exercicio3;

public class senha implements Comparable<senha> {
    private int senha;
    private String user;
    private String nif;
    public senha(int senha, String user, String nif) {
        this.senha = senha;
        this.user = user;
        this.nif = nif;
    }
    public int getSenha() {
        return senha;
    }
    public String getUser() {
        return user;
    }
    public String getNif() {
        return nif;
    }

    @Override
    public String toString() {
        return "senha{" +
                "senha=" + senha +
                ", user='" + user + '\'' +
                ", nif='" + nif ;
    }
    public int compareTo(senha nr){
        if (senha== nr.senha)
            return 0;
        else if (senha> nr.getSenha())
            return 1;
        else
            return -1;
    }
}
