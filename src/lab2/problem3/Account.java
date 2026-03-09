package lab2.problem3;

public class Account {
    protected int accNumber;
    protected double balance;
    public Account(int accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(double sum) {
        this.balance += sum;
    }

    public void withdraw(double sum) {
        this.balance -= sum;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accNumber;
    }

    public void transfer(double amount, Account other) {
        this.balance -= amount;
        other.deposit(amount);
    }

    public String toString() {
        return "Account Number: " + this.accNumber + ", Balance: " + this.balance;
    }


    public final void print() {
        System.out.println(this.toString());
    }

}
