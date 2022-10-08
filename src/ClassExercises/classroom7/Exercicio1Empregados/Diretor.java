package Aula7HerancaPolimorfismo.Exercicio1Empregados;
/*
Diretor regional: valor fixo igual ao dobro do dos empregados sem especialização,
acrescido de um prémio que corresponde a 1% do lucro mensal nas lojas da
região.
 */
public class Diretor extends Empregado{

    private int lucroMensalReg;

    public Diretor(String nome, int lucroMensalReg) {
        super(nome);
        this.lucroMensalReg =lucroMensalReg;
    }

    @Override
    public double getSalario() {
        return (super.getSalario()*2 + (0.01*lucroMensalReg));
    }
}
