package AWork8.BankAccount;

public class CurrentAccount extends BankAccount {
    private double balance;
    private int transactions;

    public CurrentAccount(int number, String name) {
        super(number, name);
        this.balance = balance;
        this.transactions = transactions;
    }

    @Override
    public double withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return balance;
        } else {
            balance -= amount;
            transactions++;
            return balance;
        }
    }

    @Override
    public double deposit(double amount) {
        balance += amount;
        transactions++;
        System.out.println("Current balance: " + balance);
        return balance;
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05;
    }

    // Current balance
    public double getBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }

    // Return qty transactions
    public int getTransactions() {
        System.out.println("Transactions: " + transactions);
        return transactions;
    }
}
