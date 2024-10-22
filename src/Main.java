import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Angebot angebot =
                new Angebot(100, LocalDate.of(2024, 4, 17), "001");

        System.out.println(angebot);
        System.out.println("Redurierter Preis des Fluges: " + angebot.getReduzierterPreis());
    }
}