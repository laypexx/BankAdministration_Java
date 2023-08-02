import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bank Musterbank = new Bank("Musterbank");

        Person bob = new Person(1, "Müller", "Bob", LocalDate.of(1990, 5, 20), "Musterstraße 1");
        Person dave = new Person(2, "Hartmann", "Dave", LocalDate.of(2006, 4, 19), "Davestreet 1");

        Bankaccount bobACC = new Bankaccount(1000, 123456, bob);
        Bankaccount daveACC = new Bankaccount(32.58,654321, dave);
        Musterbank.addAccount(bobACC);
        Musterbank.addAccount(daveACC);

        Transaction transaction = new Transaction(daveACC, bobACC, 500, LocalDate.now(), Musterbank);

        System.out.println("Neue Transaktion: von " + transaction.senderAccount + " zu " + transaction.receiverAccount +" Summe: " + transaction.Summe + " am " + transaction.Date);
        System.out.println("");
        transaction.execute();
        System.out.println("");

        System.out.println("Dave Kontostand: " + daveACC.getBalance());
        System.out.println("Dave Accountnummer: "+ daveACC.getAccountNumber());
        System.out.println("");

        System.out.println("Bob Kontostand: " + bobACC.getBalance());
        System.out.println("Bob Accountnummer: "+ bobACC.getAccountNumber());
        System.out.println("");

        System.out.println("Gesamtsaldo der Bank: " + Musterbank.getTotalBalance());
        System.out.println("Alle Accounts der Bank: " + Musterbank.getAllAccounts());
    }
}
