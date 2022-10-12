package IndependentWork6.ex2_calculator;
/*
Implemente a classe Calculator. O objeto calculadora deve conseguir
realizar os cálculos matemáticos comuns de uma calculadora normal:
    a. Soma
    b. Subtração
    c. Multiplicação
    d. Divisão
    e. Potência
    f. Resto da divisão
    g. Fórmula resolvente
    h. A calculadora possui ainda um histórico das operações realizadas, armazenadas em formato String num vetor.
        Desenvolva as funções necessárias para:
            i. guardar o histórico no vetor;
            ii. Obter o histórico completo;
            iii. Obter as últimas operações realizadas pela calculadora (histórico parcial).
 */
public class Calculator {
    private String[] historico;

    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.soma(1, 4);
        c.div(7, 1);
        c.potencia(2, 4);
        c.formResolvente(1, 2, 3);
        c.sub(4, 1);
        c.restoDiv(2, 2);

        c.historicoCompleto();

    }

    ////////////////////////////////    Funções Calculadora     ////////////////////////////////
    //a
    public double soma(int a, int b) {
        guardar(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    //b
    public double sub(int a, int b) {
        guardar(a + "-" + b + "=" + (a - b));
        return a - b;
    }

    //c
    public double mult(int a, int b) {
        guardar(a + "x" + b + "=" + (a * b));
        return a * b;
    }

    //d
    public double div(int a, int b) {
        guardar(a + "/" + b + "=" + (a / b));
        return a / b;
    }

    //e
    public double potencia(int a, int b) {
        guardar(a + "^" + b + "=" + (Math.pow(a, b)));
        return Math.pow(a, b);
    }

    //f
    public double restoDiv(int a, int b) {
        guardar(a + "%" + b + "=" + (a % b));
        return a % b;
    }

    //g
    public String formResolvente(int a, int b, int c) {
        double x = (-b + Math.sqrt((4 * a * c))) / (2 * a);
        double y = (-b - Math.sqrt((4 * a * c))) / (2 * a);
        guardar("Foi resolvida a formula resolvente para a=" + a + ", b=" + b + ", c=" + c + "; " +
                "Resultado: X=" + x + " V X=" + y);
        return "X=" + x + "V X=" + y;
    }

    ////////////////////////////////    Histórico   ////////////////////////////////
    public void guardar(String s) {
        //Criar um vetor de Strings, adicionar a String das funções acima ao vetor do histórico
        String[] h = new String[1];
        h[0] = s;
        historico = merge(historico, h);
    }

    public void historicoCompleto() {
        for (int i = 0; i < historico.length; i++) {
            System.out.println(historico[i]);
        }
    }

    public void ultimas5Operacoes() {
        //Iterar do final e "remove" as 5 operações mais antigas
        for (int i = historico.length - 1; i < historico.length - 5; i--) {
            System.out.println(historico[i]);
        }
    }

    ////////////////////////////////    MERGE   ////////////////////////////////
    private static String[] merge(String[] v1, String[] v2) {
        String[] novo = new String[v1.length + v2.length];
        for (int i = 0; i < v1.length; i++) {
            novo[i] = v1[i];
        }
        for (int i = 0; i < v2.length; i++) {
            novo[v1.length + i] = v2[i];
        }
        return novo;
    }

}
