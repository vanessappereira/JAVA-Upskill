package independentWork8.ex2_bankAccount.accounts;

import java.util.Scanner;

public class savingsAccount extends bankAccount {
    private int nTransactions;
    private double taxRate;

    public savingsAccount(String password, String accountNumber, double balance, String currency) {
        super(password, accountNumber, balance, currency);
        this.nTransactions = nTransactions;
        this.taxRate = taxRate;
    }

    public static void newAccount() {
        Scanner a = new Scanner(System.in);
        System.out.println("Please add your account number:");
        String accountNumber = a.next();

        System.out.println("Provide your current balance: ");
        double balance = a.nextDouble();

        System.out.println("Your bank currency: ");
        String currency = a.next();

        savingsAccount.newAccount();
        bankAccount.setPassword();
        System.out.println("Thank you, your initial password is: " + bankAccount.setPassword());
    }

    private double income() {
        return getTaxRate();
    }

    @Override
    public void withdraw(double value) {
        if (getBalance() - value - income() > 0) {
            setBalance(getBalance() - value - income());
            nTransactions++;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public void deposit(double value) {
        setBalance(getBalance() + value);
        nTransactions++;
    }

    @Override
    public void extract() {
        System.out.println("Currently you have: " + getBalance() + getCurrency());
    }
    //      GETS        //
    public int getnTransactions() {
        return nTransactions;
    }

    public double getTaxRate() {
        return taxRate;
    }
    //      SETS        //

    public void setnTransactions(int nTransactions) {
        this.nTransactions = nTransactions;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
