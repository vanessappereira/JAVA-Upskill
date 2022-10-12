package independentWork8.ex2_bankAccount.accounts;

import java.util.Scanner;

public class SavingsAccount extends BankAccount {

    private int nTransactions;
    private double taxRate;

    public SavingsAccount(String password, String accountNumber, double balance, String currency) {
        super(password, accountNumber, balance, currency);
        this.nTransactions = nTransactions;
        this.taxRate = taxRate;
    }

    public static void newAccount(String accountNumber, double balance, String currency) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please add your account number:");
        accountNumber = a.next();

        System.out.println("Provide your current balance: ");
        balance = a.nextDouble();

        System.out.println("Your bank currency: ");
        currency = a.next();


        SavingsAccount.newAccount(accountNumber, balance, currency);
        BankAccount.setPassword();


        System.out.println("Thank you, your initial password is: " + BankAccount.setPassword());
        a.close();
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
