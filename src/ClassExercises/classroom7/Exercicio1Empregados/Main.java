package ClassExercises.classroom7.Exercicio1Empregados;

public class Main {
    public static void main(String[] args) {
        Empregado[] empregados = new Empregado[5];
        empregados[0] = new Empregado("Carlos");
        empregados[1] = new Diretor("Vanessa", 30000);
        empregados[2] = new Gerente("Alexandre", true);
        empregados[3] = new Empregado("Maria");
        empregados[4] = new Gerente("Zé", false);
        double soma = 0;
        for (int i = 0; i < empregados.length ; i++) {
            soma = soma + empregados[i].getSalario();
            System.out.println("Nome: " + empregados[i].getNome() + " recebeu: " + empregados[i].getSalario());
        }
        System.out.println("Vou pagar " + soma + " em salarios!");
    }
}
