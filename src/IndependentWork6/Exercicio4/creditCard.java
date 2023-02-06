package IndependentWork6.Exercicio4;

public class creditCard {
    private String titular;
    private final long numeroCard;
    private int mes, ano;
    private double maxDebit;
    private double gastoAtual = 0.0;
    private final int capacidadeHistorico = 5;
    private String[] historico = new String[capacidadeHistorico];

    public creditCard(String titular, long numeroCard, int mes, int ano, double maxDebit) {
        this.titular = titular;
        this.numeroCard = numeroCard;
        this.mes = mes;
        this.ano = ano;
        this.maxDebit = maxDebit;
    }

    public double saldo() {
        return maxDebit - gastoAtual;
    }

    public void pagarCredito(int pag) {
        this.gastoAtual -= pag;
    }

    public void gastar(int quantia, String descr) {
        if (this.gastoAtual + quantia <= maxDebit) {
            this.gastoAtual += quantia;
            adicionarExtrato(quantia + "Eur - " + descr);
        } else {
            System.out.println("Excedeu a quantia");
        }
    }

    private void adicionarExtrato(String s) {
        for (int i = historico.length - 1; i > 0; i--) {
            historico[i] = historico[i - 1];
        }
        historico[0] = s;
    }

    public String obterTalao() {
        return historico[0];
    }

    public String getMovimentos() {
        String movimentos = "";

        for (int i = 0; i < historico.length; i++) {
            movimentos += " " + i + "º: " + historico[i];
        }
        return movimentos;
    }

    public static void main(String[] args) {
        creditCard card = new creditCard("Joao", 123456789012L,
                05, 2022, 1000);
        card.gastar(20, "Jogo de Futebol");
        card.gastar(15, "Almoçarada");
        card.gastar(120, "Festival");
        card.gastar(14, "Curso online");

        System.out.println(card.getMovimentos());
        System.out.println(card.obterTalao());
    }
}
