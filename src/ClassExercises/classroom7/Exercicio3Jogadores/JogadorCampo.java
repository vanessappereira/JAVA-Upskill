package ClassExercises.classroom7.Exercicio3Jogadores;

public class JogadorCampo extends Jogador{
    private int PassesFeitos;
    private int PassesRecebidos;

    public JogadorCampo(String nome, int numero, int PassesFeitos,int PassesRecebidos ) {
        super(nome, numero);
        this.PassesFeitos =PassesFeitos;
        this.PassesRecebidos = PassesRecebidos;
    }

    public int getPassesFeitos() {
        return PassesFeitos;
    }

    public void setPassesFeitos(int passesFeitos) {
        PassesFeitos = passesFeitos;
    }

    public int getPassesRecebidos() {
        return PassesRecebidos;
    }

    public void setPassesRecebidos(int passesRecebidos) {
        PassesRecebidos = passesRecebidos;
    }

    @Override
    public String toString() {
        return "Jogador de campo: " + nome + " com o numero " + numero +
                " Passes feitos " + PassesFeitos + " Passes recebidos: "+ PassesRecebidos;
    }
}
