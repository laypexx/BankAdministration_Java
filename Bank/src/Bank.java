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

class Bankaccount {
    double Kontostand;
    int Kontonummer;

    Person Inhaber;
    private double balance;

    public Bankaccount(double Kontostand, int Kontonummer, Person Inhaber) {
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

    public void sendMoney(Bankaccount recipient, double amount) {
        if (this.Kontostand >= amount) {
            this.Kontostand -= amount;
            recipient.Kontostand += amount;
            System.out.println(amount+" € wurden erfolgreich an das Konto mit der Kontonummer "+ recipient.Kontonummer+" überwiesen.");
        } else {
            System.out.println("Transaktion konnte nicht durchgeführt werden, Kontostand zu niedrig!");
        }
    }

    public void getMoney(double amount) {
        if (Kontostand >= amount) {
            Kontostand -= amount;
            System.out.println(amount+" € wurden erfolgreich abgehoben.");
        } else {
            System.out.println("Ihr Konto ist nicht genügend gedeckt um "+amount+" € abzuheben.");
        }
    }

    public Person getOwner() {
        return Inhaber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
class Transaction {
    Bankaccount senderAccount;
    Bankaccount receiverAccount;
    double Summe;
    LocalDate Date;
    Bank bank;

    public Transaction(Bankaccount senderAccount, Bankaccount receiverAccount, double Summe, LocalDate Date, Bank bank) {
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.Summe = Summe;
        this.Date = Date;
        this.bank = bank;
    }

    public void execute() {
        if (senderAccount != null && receiverAccount != null) {
            if (senderAccount.getBalance() >= this.Summe) {
                senderAccount.sendMoney(receiverAccount, this.Summe);
                System.out.println("Transaktion erfolgreich");
            } else {
                System.out.println("Transaktion fehlgeschlagen. Zu wenig Geld.");
            }
        } else {
            System.out.println("Transaktion fehlgeschlagen. Falscher Sender/Empfänger Account.");
        }
    }
}


