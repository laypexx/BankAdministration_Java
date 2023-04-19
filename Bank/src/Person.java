import java.time.LocalDate;
import java.time.Period;

public class Person {
    int P_ID;
    String Name;
    String Vorname;
    LocalDate Birthday;
    String Adresse;


    public Person(int P_ID, String Name, String Vorname, LocalDate Birthday, String Adresse) {
        this.P_ID = P_ID;
        this.Name = Name;
        this.Vorname = Vorname;
        this.Birthday = Birthday;
        this.Adresse = Adresse;
    }

    public void getAge() {
        LocalDate heute = LocalDate.now();
        int alter = Period.between(this.Birthday, heute).getYears();
    }
}
