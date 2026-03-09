package lab2.problem3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }


    public void addInterest() {
        balance += balance * interestRate / 100.0;
    }

    @Override
    public String toString() {
        return "Saving Account { " + super.toString() + " interest rate " + this.interestRate + "% }";
    }

}
