package ClassExercises.classroom7.Exercicio3Jogadores;

public class GuardaRedes extends Jogador{
    private int GolosSofridos;

    public GuardaRedes(String nome, int numero, int GolosSofridos) {
        super(nome, numero);
        this.GolosSofridos = GolosSofridos;
    }

    public int getGolosSofridos() {
        return GolosSofridos;
    }

    public void setGolosSofridos(int golosSofridos) {
        GolosSofridos = golosSofridos;
    }

    @Override
    public String toString() {
        return "Guarda Redes: " + nome + " com o numero " + numero +
                " Sofreu " + GolosSofridos + " golos.";
    }
}
