import java.time.LocalDate;

public class Level_3_Aufgabe_10 {
    public static void main(String[] args) {
        String name = "Niko";
        String alter = "36";
        String spruch = "Das ergibt keinen Sinn!";
        LocalDate Geburtsdatum = LocalDate.of(1999, 11, 29);
        LocalDate jetzt = LocalDate.now();

        System.out.println(name + ", " + alter + ", " + spruch + ". Geboren: " + Geburtsdatum);

        System.out.println(jetzt.compareTo(Geburtsdatum) * 60 * 60 * 24 * 30 * 12);
    }
}
