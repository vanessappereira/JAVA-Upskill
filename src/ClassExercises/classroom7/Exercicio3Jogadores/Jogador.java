package Aula7HerancaPolimorfismo.Exercicio3Jogadores;

public class Jogador {
    public String nome;
    public int numero;

    public Jogador(String nome, int numero){
        this.nome=nome;
        this.numero=numero;
    }

    @Override
    public String toString() {
        return "GuardaRedes: " + nome + " com o numero " + numero;
    }
}
