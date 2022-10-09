package independentWork8.ex2_bankAccount.accounts;

public class savingsAccount extends bankAccount {
    private int nTransactions;
    private double taxRate;

    public savingsAccount(String password, String accountNumber, double balance, String currency) {
        super(password, accountNumber, balance, currency);
        this.nTransactions = nTransactions;
        this.taxRate = taxRate;
    }

    public static void newAccount(String accountNumber, double balance, String currency) {

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
