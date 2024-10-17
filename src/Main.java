import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Angebot angebot =
                new Angebot(20, LocalDate.of(2000, 1, 17), "001");

        angebot.anzeigen();
    }
}