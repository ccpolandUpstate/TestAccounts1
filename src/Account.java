public class Account {
    private double balance;
    private String name;
    private long accNum;
    private static int numAccounts = 0;

    // Constructor
    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
        accNum = (int)(Math.random() * Integer.MAX_VALUE);
        numAccounts++;
    }
    // Checkers, withdraw, get balance, and deposit.
    public void withdraw(double amount) {
        if(balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }
    // Deposit
    public void deposit(double amount) {
        balance += amount;
    }
    // Get balance
    public double getBalance() {
        return balance;
    }
    // Get name accNum and balance
    public String toString() {
        return "Name: " + name +
                "\nAccount Number: " + accNum +
                "\nBalance: " + balance;
    }
    // Get number of accounts
    public static int getNumAccounts() {
        return numAccounts;
    }
    // Method to close account
    public void close() {
        name = "CLOSED";
        balance = 0;
        numAccounts--;
    }
}
