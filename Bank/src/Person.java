import java.time.LocalDate;
import java.time.Period;

public class Person {
    int P_ID;
    String Name;
    String Vorname;
    LocalDate Birthday;


    public Person(int P_ID, String Name, String Vorname, LocalDate Birthday) {
        this.P_ID = P_ID;
        this.Name = Name;
        this.Vorname = Vorname;
        this.Birthday = Birthday;
    }

    public void getAge() {
        LocalDate heute = LocalDate.now();
        int alter = Period.between(this.Birthday, heute).getYears();
    }
}
