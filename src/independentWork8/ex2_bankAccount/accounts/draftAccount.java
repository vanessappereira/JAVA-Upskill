package independentWork8.ex2_bankAccount.accounts;

public class draftAccount extends bankAccount {
    private int nTransactions;

    public draftAccount(String password, String accountNumber, double balance, String currency) {
        super(password, accountNumber, balance, currency);
        this.nTransactions = nTransactions;
    }

    public static void newAccount(String accountNumber, double balance, String currency) {

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
