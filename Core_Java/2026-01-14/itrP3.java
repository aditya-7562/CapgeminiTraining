/* Banking System (Main Question)

- Create an interface BankOperations with methods deposit(), withdraw(), and checkBalance().

- Create an abstract class Account with encapsulated fields accountNo, holderName, and balance.

- Create SavingsAccount and CurrentAccount classes (extend Account and implement BankOperations).

- Store multiple accounts in an ArrayList<Account>.

Demonstrate runtime polymorphism while performing operations.
	Add features:
	Add a new account
	Remove an account by account number
	Search for an account
	Display all accounts
	Deposit/Withdraw money into/from a chosen account
 */

import java.util.*;

interface BankOperations {
    void deposit(double amount);

    void withdraw(double amount);

    double checkBalance();
}

abstract class Account implements BankOperations {
    private String accountNo;
    private String holderName;
    protected double balance;

    public Account(String accountNo, String holderName, double initialBalance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getHolderName() {
        return holderName;
    }
}

class SavingsAccount extends Account{
    public SavingsAccount(String accountNo, String holderName, double initialBalance) {
        super(accountNo, holderName, initialBalance);
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    @Override
    public double checkBalance() {
        return balance;
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accountNo, String holderName, double initialBalance) {
        super(accountNo, holderName, initialBalance);
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    @Override
    public double checkBalance() {
        return balance;
    }
}

public class itrP3 {
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();
        
        // Add account
        accounts.add(new SavingsAccount("SA002", "Aditya", 3000.0));
        accounts.add(new CurrentAccount("CA002", "Vikash", 2500.0));
        accounts.add(new SavingsAccount("SA001", "John", 1000.0));
        accounts.add(new CurrentAccount("CA001", "Jane", 2000.0));
        
        // Deposit & Withdraw
        for (Account account : accounts) {
            account.deposit(500);
            System.out.println("Balance after deposit: " + account.checkBalance());
            account.withdraw(200);
            System.out.println("Balance after withdrawal: " + account.checkBalance());
        }
 

        // SHow all account
        for (Account account : accounts) {
            System.out.println("Account No: " + account.getAccountNo() + ", Holder Name: " + account.getHolderName() + ", Balance: " + account.checkBalance());
        }

        // Search account
        String searchAccountNo = "SA001";
        for (Account account : accounts) {
            if (account.getAccountNo().equals(searchAccountNo)) {
                System.out.println("Found Account - Account No: " + account.getAccountNo() + ", Holder Name: " + account.getHolderName() + ", Balance: " + account.checkBalance());
            }
        }

        // Remove account
        String removeAccountNo = "CA001";
        accounts.removeIf(account -> account.getAccountNo().equals(removeAccountNo));
    }
}
