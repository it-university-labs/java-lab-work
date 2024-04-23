package lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        BankApplication bank1 = new BankApplication("Bank Jusan");
        BankApplication bank2 = new BankApplication("Bank Kaspi");
        BankApplication bank3 = new BankApplication("Bank Halyk");

        for (int i = 0; i < 10; i++) {
            bank1.addAccount(new Account(i + 1, "Max", "White", Math.random() * 10000));
            bank2.addAccount(new Account(i + 1, "Max", "Black", Math.random() * 10000));
            bank3.addAccount(new Account(i + 1, "Max", "Brown", Math.random() * 10000));
        }

        ArrayList<BankApplication> banks = new ArrayList<>();
        banks.add(bank1);
        banks.add(bank2);
        banks.add(bank3);

        Collections.sort(banks, new Comparator<BankApplication>() {
            @Override
            public int compare(BankApplication bank1, BankApplication bank2) {
                return Double.compare(bank2.getAverageBalance(), bank1.getAverageBalance());
            }
        });

        for (BankApplication bank : banks) {
            System.out.println(bank.getBankData());
            System.out.println("Accounts:");
            for (Account acc : bank.getAccounts()) {
                System.out.println(acc);
            }
            System.out.println();
        }
    }
}
