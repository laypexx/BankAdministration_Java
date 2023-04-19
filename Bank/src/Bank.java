import java.time.LocalDate;
import java.time.Period;

public class Bank<L> {
String name;
L List;

    public Bank (String name, L List) {
        this.name = name;
        this.List = List;
    }

    public void setValue(L List) {
        this.List = List;
    }

    public void addAccount() {

    }

    public void removeAccount() {

    }

    public void getAccount() {

    }

    public void getAllAccounts() {

    }

    public void getTotalBalance() {

    }
}

class Bankaccount<L> extends Bank {
    double Kontostand;
    int Kontonummer;

    Person Inhaber;

    public Bankaccount(String name, L List, double Kontostand, int Kontonummer, Person Inhaber) {
        super(name, List);
        this.Kontostand = Kontostand;
        this.Kontonummer = Kontonummer;
        this.Inhaber = Inhaber;
    }

    public void sendMoney() {

    }

    public void getMoney() {

    }

    public void getBalance(double Kontostand) {

    }

    public void getOwner(Person Inhaber) {

    }
}

class Transaction<L> extends Bankaccount {
    Person Sender;
    Person Empfaenger;
    double Summe;
    LocalDate Date;

    public Transaction(String name, L List, double Kontostand, int Kontonummer, Person Inhaber, Person Sender, Person Empfaenger, double Summe, LocalDate Date) {
        super(name, List, Kontostand, Kontonummer, Inhaber);
        this.Sender = Sender;
        this.Empfaenger = Empfaenger;
        this.Summe = Summe;
        this.Date = Date;
    }

    public void execute() {
        LocalDate Date = LocalDate.now();
    }
}


