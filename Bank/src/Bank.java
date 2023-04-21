import java.time.LocalDate;
import java.util.ArrayList;

public class Bank {
String name;
ArrayList<Bankaccount> accounts;

    public Bank (String name) {
        this.name = name;
        accounts = new ArrayList<Bankaccount>();
    }

    public void addAccount(Bankaccount account) {
        accounts.add(account);
    }

    public void removeAccount(Bankaccount account) {
        accounts.remove(account);
    }

    public Bankaccount getAccount(int Accountnumber) {
        for (Bankaccount account: accounts) {
            if (account.getAccountNumber() == Accountnumber) {
                return account;
            }
        }
        return null;
    }

    public ArrayList<Bankaccount> getAllAccounts() {
        return accounts;
    }

    public double getTotalBalance() {
        double totalBalance = 0;
        for (Bankaccount account: accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }
}

class Bankaccount extends Bank {
    double Kontostand;
    int Kontonummer;

    Person Inhaber;

    public Bankaccount(String name, double Kontostand, int Kontonummer, Person Inhaber) {
        super(name);
        this.Kontostand = Kontostand;
        this.Kontonummer = Kontonummer;
        this.Inhaber = Inhaber;
    }

    public int getAccountNumber() {
        return Kontonummer;
    }

    public double getBalance () {
        return Kontostand;
    }

    public void sendMoney() {

    }

    public void getMoney() {

    }

    public void getOwner(Person Inhaber) {

    }
}
class Transaction {
    Person Sender;
    Person Empfaenger;
    double Summe;
    LocalDate Date;

    public Transaction(Person Sender, Person Empfaenger, double Summe, LocalDate Date) {
        this.Sender = Sender;
        this.Empfaenger = Empfaenger;
        this.Summe = Summe;
        this.Date = Date;
    }

    public void execute() {
        LocalDate Date = LocalDate.now();
    }
}


