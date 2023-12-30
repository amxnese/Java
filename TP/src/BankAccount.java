import java.util.Random;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(double balance) {
        // Generate a random 8-digit account number
        this.accountNumber = generateAccountNumber();
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    private String generateAccountNumber(){
        Random random = new Random();
        return String.format("%08d", random.nextInt(100000000));
    }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(200);
        
        account.deposit(400);
        account.withdraw(300);
        account.withdraw(250);  // after this withdrawal the balance will be less than 100
        account.withdraw(100); // Hence This Withdrawal Won't Take Place
        System.out.println("Final balance: $" + account.getBalance());
    }

}
class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= 100 && amount > 0 && amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds for savings account.");
        }
    }
}