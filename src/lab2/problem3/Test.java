package lab2.problem3;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account a1 = new Account(1001, 5000);
        SavingsAccount s1 = new SavingsAccount(1002, 10000, 5);
        CheckingAccount c1 = new CheckingAccount(1003, 2000);

        bank.openAccount(a1);
        bank.openAccount(s1);
        bank.openAccount(c1);

        System.out.println("Before operations:");
        bank.printAccounts();


        // TESTING ACCOUNT
        a1.deposit(1000);
        a1.withdraw(500);


        // TESTING CHECK_ACCOUNT
        c1.deposit(100);
        c1.withdraw(50);
        c1.deposit(200);
        c1.withdraw(100);

        // TRANSFER
        a1.transfer(300, c1);

        System.out.println("\nBefore update:");
        bank.printAccounts();


        // UPDATING AFTER CREATING
        bank.update();

        System.out.println("\nAfter update:");
        bank.printAccounts();
    }
}