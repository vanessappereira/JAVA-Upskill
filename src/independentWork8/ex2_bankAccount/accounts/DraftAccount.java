package independentWork8.ex2_bankAccount.accounts;

import java.util.Scanner;

public class DraftAccount extends BankAccount {
    private int nTransactions;

    public DraftAccount(String password, String accountNumber, double balance, String currency) {
        super(password, accountNumber, balance, currency);
        this.nTransactions = nTransactions;
    }

    public static void newAccount() {
        Scanner a = new Scanner(System.in);
        System.out.println("Please add your account number:");
        String accountNumber = a.next();

        System.out.println("Provide your current balance: ");
        double balance = a.nextDouble();

        System.out.println("Your bank currency: ");
        String currency = a.next();

        DraftAccount.newAccount();
        BankAccount.setPassword();
        System.out.println("Thank you, your initial password is: " + BankAccount.setPassword());
        a.close();
    }


    @Override
    public void withdraw(double value) {
        if (getBalance() - value > 0) {
            setBalance(getBalance() - value);
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
}
