import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Angebot> angebote = new ArrayList<>();

        Angebot a1 =
                new Angebot(100, LocalDate.of(2024, 4, 10), "001");
        Angebot a2 =
                new Angebot(150, LocalDate.of(2024, 1, 7), "002");
        Angebot a3 =
                new Angebot(200, LocalDate.of(2024, 10, 27), "003");


        angebote.add(a1);
        angebote.add(a2);
        angebote.add(a3);

        for (Angebot angebot : angebote){
            System.out.println(angebot);
            System.out.println("Redurierter Preis des Fluges: " + angebot.getReduzierterPreis());
            System.out.println(" ");
        }

    }
}