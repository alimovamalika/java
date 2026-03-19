class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", new balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds! Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", new balance: " + balance);
        }
    }

    void displayBalance() {
        System.out.println("Account " + accountNumber + " balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

class CreditAccount extends BankAccount {
    CreditAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

public class Task4Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 1000);
        CreditAccount credit = new CreditAccount("CA456", 500);

        savings.displayBalance();
        savings.deposit(200);
        savings.withdraw(150);

        System.out.println();

        credit.displayBalance();
        credit.withdraw(600); // попытка снять больше баланса
        credit.deposit(300);
        credit.withdraw(400);
    }
}