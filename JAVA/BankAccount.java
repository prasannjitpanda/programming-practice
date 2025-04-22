public class BankAccount {
    public static void main(String[] args) {
        // Create a new bank account with an initial balance of 1000
        BankAccount account = new BankAccount(1000);
        
        // Deposit 500 into the account
        account.deposit(500);
        
        // Withdraw 200 from the account
        account.withdraw(200);
        
        // Print the current balance
        System.out.println("Current balance: " + account.getBalance());
    }
    private double balance;

    // Constructor to initialize the account with a balance
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for withdrawal");
        }
        balance -= amount;
    }
    // Method to get the current balance of the account
    public double getBalance() {
        return balance;
    }
}