package AWork6.creditCard;

public class creditCard {
    private final String owner;
    private final long cardNumber;
    private final int expirationMonth, expirationYear;
    private double atualBalance;
    private double creditLimit;
    private final int historyCapacity = 5;
    private String[] history = new String[historyCapacity];

    public creditCard(String owner, long cardNumber, int expirationMonth, int expirationYear, double creditLimit) {
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.creditLimit = creditLimit;
    }

    // Check balance
    public double getBalance() {
        return atualBalance;
    }

    // Check credit limit
    public double getCreditLimit() {
        return creditLimit;
    }

    // Pay Credit
    public void payCredit(double amount) {
        if (amount > 0) {
            if (atualBalance + amount <= creditLimit) {
                atualBalance += amount;
                System.out.println("Payment of Eur " + amount + " accepted.");
            } else {
                System.out.println("Payment of Eur " + amount + " refused. Exceeds credit");
            }
        } else {
            System.out.println("Payment of Eur " + amount + " refused. Amount must be greater than zero");
        }
    }

    // Spend
    public void spend(double amount, String descr) {
        if (amount > 0) {
            if (this.atualBalance + amount <= creditLimit) {
                this.atualBalance += amount;
                // Add to extract
                addExtract(amount + " Eur " + descr);
                System.out.println("Spend of Eur " + amount + " accepted.");
            }

        }
    }

    private void addExtract(String string) {
        for (int i = history.length - 1; i > 0; i--) {
            history[i] = history[i - 1];
        }
        history[0] = string;
    }

    // Get extract
    public String getExtract() {
        String extract = "";
        for (int i = 0; i < history.length; i++) {
            extract += " " + i + " º: " + history[i] + "\n";
        }
        return extract;
    }

    // Get ticket
    public String getTicket() {
        return history[0];
    }

    public static void main(String[] args) {
        // Create a new card
        creditCard card = new creditCard("John Doe", 123456789012L, 05, 2022, 1000);

        card.spend(20,"Football");
        card.spend(15, "Lunch");
        card.spend(50, "Shopping");
        card.spend(100, "Festival");

        System.out.println(card.getBalance());
        System.out.println(card.getTicket());

    }
}
