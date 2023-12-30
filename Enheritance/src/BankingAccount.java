import java.util.Random;

public class BankingAccount {
    private String accountNumber;
    private double balance;
    private Random random = new Random();

    BankingAccount(){
        this.balance = 0;
        this.accountNumber = Integer.toString(random.nextInt(10000000,99999999));
    }

    BankingAccount(double balance){
        this.balance = balance;
        this.accountNumber = Integer.toString(random.nextInt(10000000,99999999));
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double value){
        if(value > 0){
            this.balance += value;
        }
        System.out.println("New Balance: $" + balance);
    }

    void withdrawal(double value){
        if (value < 0 || value > this.balance){
            System.out.println("invalid value or insufficient balance!!!");
            return;
        }
        this.balance -= value;
        System.out.println("New Balance: $" + balance);
    }

    void setBalance(double balance) {
        this.balance = balance;
        System.out.println("New Balance: $" + balance);
    }

    @Override
    public String toString(){
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
    public static void main(String[] args) {

        // Ahmed is a Customer who wants to Open a Saving Account in this bank
        // the Bank is applying a 3% interestRate Now and initial deposit of Ahmed 100 Dollar's
        // Ahmed is an object (instance) created from the class SavingAccount because ahmed's account is a Saving Account.
        // SavingAccount is a child class who inherit members of the class BankingAccount(ParentClass)

        System.out.println("****** Ahmed Account ******\n");
        SavingAccount ahmed = new SavingAccount(3.0,100);
        // we can describe the object ahmed because our class has the ToString Method.
        System.out.println(ahmed);

        // Ahmed's balance now is 100 Dollar.
        System.out.println(ahmed.getBalance());

        // after a time ahmed came to the bank and deposited a 120 Dollars.
        ahmed.deposit(120);

        // in another time ahmed withdraw 50 Dollars, Now ahmed has 170 Dollar in his account
        ahmed.withdrawal(50);

        // next time ahmed came to the Bank and tried to withdraw 200 Dollar
        // the operation didn't work properly because ahmed doesn't have a 200 Dollar in his account.
        ahmed.withdrawal(200);

        // after 6 months the bank applied the interest to ahmed's account.
        ahmed.applyInterest();

        // and now he has some extra money in his account.
        System.out.println(ahmed.getBalance());

        System.out.println("****** Sara Account ******\n");

        // Sara is another Customer who wants to Open a checking Account in this bank
        // the Bank is putting a 200 withdraw limit every day and without any essential deposit
        // Sara is an object (instance) created from the class CheckingAccount because ahmed's account is a Saving Account.
        // CheckingAccount is a child class who inherit members of the class BankingAccount(ParentClass).

        CheckingAccount sara = new CheckingAccount(200);
        // we can describe our object sara due to the ToString method and this time show different results than ahmed's.
        // because we overrode the method ToString.
        System.out.println(sara);

        // Sara after depositing the first amount of money in her account.
        sara.deposit(700);

        // after few days Sara was in need of some money, so she withdraws 150 Dollar.
        sara.withdrawal(150);

        // due to some circumstances sara needed 400 Dollars.
        // the withdrawal operation wasn't valid because the Checking account has a limit of 200 Dollar every day.
        sara.withdrawal(400);

        // so Sara decided to withdraw 200 Dollars today and comeback tomorrow to get the rest of her money.
        sara.withdrawal(200);
        
        // the next day Sara come to the bank again and withdraw another 200 Dollars.
        sara.withdrawal(200);

        // after a long time Sara tried to withdraw 200 Dollars
        // the system didn't allow her to do that because she has only 150 Dollars in her account.
        sara.withdrawal(200);
    }
}

class CheckingAccount extends BankingAccount{
    private double overDraftLimit;

    CheckingAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    CheckingAccount(double overDraftLimit, double balance){
        super(balance);
        this.overDraftLimit = overDraftLimit;
    }

    void setOverDraftLimit(double newOverDraft) {
        this.overDraftLimit = newOverDraft;
    }

    void withdrawal(double value){
        if (value < 0 || value > getBalance()){
            System.out.println("Invalid Value or Insufficient Balance!!!");
            return;
        }
        if (value > this.overDraftLimit){
            System.out.println("You are not allowed to withdraw this amount of money your limit is " +
                    this.overDraftLimit);
            return;
        }
        setBalance(getBalance() - value);
        System.out.println("New Balance: " + getBalance());
    }

    @Override
    public String toString() {
        return "SavingAccount\n{" +
                "\nAccountNumber : " + super.getAccountNumber() +
                " $\nBalance = "  + super.getBalance() +
                "\nover draft limit = " + this.overDraftLimit +
                " $\n}";
    }
}

class SavingAccount extends BankingAccount{
    private double interestRate;

    SavingAccount(double interestRate){
        this.interestRate = interestRate;
    }

    SavingAccount(double interestRate,double balance){
        super(balance);
        this.interestRate = interestRate;
    }

    void setInterestRate(double NinterestRate) {
        this.interestRate = NinterestRate;
    }

    double getInterestRate() {
        return interestRate;
    }

    void applyInterest(){
        setBalance(getBalance() + (getBalance() * (interestRate/100)));
    }

    @Override
    public String toString() {
        return "SavingAccount\n{" +
                "\nAccountNumber : " + super.getAccountNumber() +
                "\nBalance = "  + super.getBalance() +
                " $\ninterestRate = " + this.interestRate +
                " %\n}";
    }
}