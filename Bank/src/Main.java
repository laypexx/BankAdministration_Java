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

        Transaction transaction = new Transaction(bobACC, daveACC, 500, LocalDate.now(), Musterbank);
        transaction.execute();

        System.out.println("Dave Kontostand: " + daveACC.getBalance());
        System.out.println("Bob Kontostand: " + bobACC.getBalance());
        System.out.println("Gesamtsaldo der Bank: " + Musterbank.getTotalBalance());
    }
}
