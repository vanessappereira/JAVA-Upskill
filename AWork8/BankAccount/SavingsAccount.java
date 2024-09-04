package AWork8.BankAccount;

public class SavingsAccount extends BankAccount {
    private double balance, interestRate;

    public SavingsAccount(int number, String name) {
        super(number, name);
        this.balance = balance;
        this.interestRate = interestRate;

    }

    @Override
    // Deposit Money
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have deposited $" + amount + " into your account.");
        } else {
            System.out.println("Invalid amount.");
        }
        return amount;
    }
    
    @Override
    // Withdraw Money
    public double withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("You have withdrawn $" + amount + " from your account.");
            } else {
                System.out.println("Insufficient funds.");
            }
        }
        return amount;
    }

    @Override
    // Calculate Interest
    public double calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Your interest is $" + interest + ". Your new balance is $" + balance);
        return interest;
    }

}
