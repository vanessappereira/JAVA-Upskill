package ClassExercises.classroom7.Exercicio1Empregados;
/*
Gerente de loja: valor fixo igual ao dos empregados sem especialização, acrescido
de um prémio de 200€ que é atribuído sempre que a loja cumpre os objectivos
das vendas.
 */
public class Gerente extends Empregado{

    private boolean cumpriuObj;

    private int premio = 200;

    public Gerente(String nome, boolean cumpriuObj) {
        super(nome);
        this.cumpriuObj = cumpriuObj;
    }

    @Override
    public double getSalario() {
        if(cumpriuObj){
            return super.getSalario() + premio;
        } else {
            return super.getSalario();
        }
    }
}
