/*
Q. Write a Java class named BankAccount that meets the following requirements:

1. Static Variable : 

interestRate (a static variable) representing the common interest rate for all accounts. Initialize it to 5.0%.

2. Non-Static Variable : 

balance (a non-static variable) representing the account balance. Each account starts with $1000.

3. Static Method : 

updateInterestRate(double newRate): A static method to update the interestRate for all accounts.

4. Non-Static Methods

- deposit(double amount): Adds money to the account balance.

- withdraw(double amount): Deducts money from the account if sufficient funds exist. Otherwise, display "Insufficient funds!".

- displayAccountInfo(): Displays the account's balance and the current interest rate.



5. Main Method :

- Create two bank accounts (acc1, acc2).

- Update the interest rate using the static method.

- Perform deposit and withdrawal operations on both accounts.

- Display the account details after transactions.
*/
public class BankAccount {
    static double interestRate = 0.5;
    double balance = 1000;

    public static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Balance: " + this.balance);
        System.out.println("Interest Rate: " + this.interestRate);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        updateInterestRate(0.6);
        acc1.deposit(500);
        acc2.deposit(500);
        acc1.withdraw(2000);
        acc2.withdraw(200);
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}