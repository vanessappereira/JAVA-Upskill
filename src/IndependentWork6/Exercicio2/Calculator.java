package IndependentWork6.Exercicio2;

public class Calculator {

    private String[] historico;

    public Calculator() {
        historico = new String[0];
    }

    public double soma(int a, int b) {
        guardar(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    public double subtracao(int a, int b) {
        guardar(a + "-" + b + "=" + (a - b));
        return a - b;
    }

    public double multiplicacao(int a, int b) {
        guardar(a + "*" + b + "=" + (a * b));
        return a * b;
    }

    public double divisao(int a, int b) {
        guardar(a + "/" + b + "=" + (a / b));
        return a / b;
    }

    public double potencia(int a, int b) {
        guardar(a + "^" + b + "=" + (Math.pow(a, b)));
        return Math.pow(a, b);
    }

    public double restoDiv(int a, int b) {
        guardar(a + "%" + b + "=" + (a % b));
        return a % b;
    }

    public String formulaResolvente(int a, int b, int c) {
        double x = (-b + Math.sqrt((4 * a * c))) / (2 * a);
        double y = (-b - Math.sqrt((4 * a * c))) / (2 * a);
        guardar("Foi resolvida a formula resolvente para a=" + a + ", b=" + b + ", c=" + c + "; Resultado: X=" + x + " V X=" + y);
        return "X=" + x + " V X=" + y;
    }

    public void guardar(String s) {
        String[] h = new String[1];
        h[0] = s;
        historico = merge(historico, h);
    }

    public void imprimirHistorico() {
        for (int i = 0; i < historico.length; i++) {
            System.out.println(historico[i]);
        }
    }

    public void imprimirUltimas5operacoes() {
        for (int i = historico.length - 1; i >= historico.length - 5; i--) {
            System.out.println(historico[i]);
        }
    }

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
