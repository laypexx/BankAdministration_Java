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
        return 0;
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

    @Override
    public double getTotalBalance () {
        return Kontostand;
    }

    public void sendMoney() {

    }

    public void getMoney() {

    }

    public void getOwner(Person Inhaber) {

    }
}

class Transaction extends Bankaccount {
    Person Sender;
    Person Empfaenger;
    double Summe;
    LocalDate Date;

    public Transaction(String name, double Kontostand, int Kontonummer, Person Inhaber, Person Sender, Person Empfaenger, double Summe, LocalDate Date) {
        super(name, Kontostand, Kontonummer, Inhaber);
        this.Sender = Sender;
        this.Empfaenger = Empfaenger;
        this.Summe = Summe;
        this.Date = Date;
    }

    public void execute() {
        LocalDate Date = LocalDate.now();
    }
}


