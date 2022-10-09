package independentWork8.ex2_bankAccount.accounts;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class bankAccount {
    private static ArrayList<String> accounts = new ArrayList<>();
    private static String password;
    private String accountNumber, currency;
    private double balance;

    public bankAccount(String accountNumber, String number, double balance, String currency) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
        this.password = "Password";
    }

    public static void newAccount() {
        Scanner a = new Scanner(System.in);
        System.out.println("Creating an Account:\nWhich account you would like to add?\nOption 1: Draft Account\nOption 2: Savings Account");
        int option = a.nextInt();
        if (option == 1) {
            draftAccount.newAccount();
        }
        if (option == 2) {
            savingsAccount.newAccount();
        }
    }

    //exercise 2_b
    public abstract void withdraw(double value);

    public abstract void deposit(double value);

    public abstract void extract();

    //exercise 2_c

    public void changePassword() {
        System.out.println("Please insert your current password:");
        Scanner s = new Scanner(System.in);
        String oldPassword = s.next();
        if (oldPassword.equals(password)) {
            System.out.println("Please insert new password:");
            String newPassword = s.next();
            password = newPassword;
        } else {
            System.out.println("Incorrect password, please try again:");
        }
    }

    //      GETS        //
    public String getPassword() {
        return password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public static ArrayList<String> getAccounts() {
        return accounts;
    }
    //      SETS        //

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAccounts(ArrayList<String> accounts) {
        bankAccount.accounts = accounts;
    }

    public static String setPassword() {
        return "Password";
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
