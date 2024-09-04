package AWork8.BankAccount;

public abstract class BankAccount {
    private int number;
    private String password = "JohnDoe", name;

    public BankAccount(int number, String name) {
        this.number = number;
        this.name = name;
    }

    // Get password
    public String getPassword() {
        System.out.println("Your initial password is: " + getPassword());
        return password;
    }

    // Set password
    public void setPassword(String password) {
        this.password = password;
    }

    public abstract double withdraw(double amount);

    public abstract double deposit(double amount);

    public abstract double calculateInterest();

    // extract account


}
