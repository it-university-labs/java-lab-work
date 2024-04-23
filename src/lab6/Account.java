package lab6;

import java.util.ArrayList;

public class Account {
    int id;
    String name;
    String surname;
    double balance;

    Account(){}

    Account(int id, String name, String surname, double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                '}';
    }
}
class BankApplication {
    private String name;
    private ArrayList<Account> accounts;

    public BankApplication(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i) {
        accounts.remove(i);
    }

    public Account getMaxAccount() {
        if (accounts.isEmpty()) {
            return null;
        }

        Account maxAccount = accounts.get(0);
        for(Account acc : accounts) {
            if (acc.getBalance() >  maxAccount.getBalance()) {
                maxAccount = acc;
            }
        }
        return maxAccount;
    }

    public double getAverageBalance() {
        if (accounts.isEmpty()) {
            return 0;
        }

        double totalBalance = 0;
        for(Account acc : accounts) {
            totalBalance += acc.getBalance();
        }
        return totalBalance/accounts.size();
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (Account acc : accounts) {
            totalBalance += acc.getBalance();
        }
        return totalBalance;
    }

    public int totalAccounts() {
        return accounts.size();
    }

    public String getBankData() {
        return "Bank Name: " + name + "\n" +
                "Total Accounts: " + totalAccounts() + "\n" +
                "Total Balance: " + getTotalBalance() + "\n" +
                "Average Balance: " + getAverageBalance();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
}