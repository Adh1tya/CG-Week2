
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount for " + holderName);
        }
    }

   
    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of $" + amount + " (Savings Account)");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 1000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; 
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of $" + amount + " (Current Account)");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SA123", "Alice", 3000),
            new CurrentAccount("CA456", "Bob", 8000)
        };

        for (BankAccount account : accounts) {
            account.displayDetails();
            account.deposit(500);
            account.withdraw(1000);
            System.out.println("Interest Earned: $" + account.calculateInterest());

            
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan(10000);
                System.out.println("Loan Eligibility: " + (loanAccount.calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
            }

            
        }
    }
}
