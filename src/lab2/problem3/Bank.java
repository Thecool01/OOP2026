package lab2.problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accNumber) {
                accounts.remove(i);
                break;
            }
        }
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) account;
                sa.addInterest();
            } else if (account instanceof CheckingAccount) {
                CheckingAccount ca = (CheckingAccount) account;
                ca.deductFee();
            }
        }
    }

    public void printAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}