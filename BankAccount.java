import java.util.ArrayList;

public class BankAccount {

    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();

        transactions.add("Account created with balance: Rs. " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        balance += amount;
        transactions.add("Deposited: Rs. " + amount);
        System.out.println("Deposit successful!");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        balance -= amount;
        transactions.add("Withdrawn: Rs. " + amount);
        System.out.println("Withdrawal successful!");
    }

    public void checkBalance() {
        System.out.printf("Account Holder: %s%n", accountHolder);
        System.out.printf("Current Balance: Rs. %.2f%n", balance);
    }

    public void showTransactions() {
        System.out.println("\n===== TRANSACTION HISTORY =====");

        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}