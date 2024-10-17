import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;
import java.util.UUID;

public class Angebot {

    private double preis;

    private LocalDate flugdatum;

    private String flugnummer;

    public Angebot(double preis, LocalDate flugdatum, String flugnummer) {
        setPreis(preis);
        setFlugdatum(flugdatum);
        setFlugnummer(flugnummer);
    }

    public double getPreis() {
        return preis;
    }

    public LocalDate getFlugdatum() {
        return flugdatum;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setPreis(double preis) {
        if (preis <= 0)
        {
            throw new IllegalArgumentException("Preis kann nicht 0 oder weniger sein");
        }
        this.preis = preis;
    }

    public void setFlugdatum(LocalDate flugdatum) {
        Objects.requireNonNull(flugdatum);
        this.flugdatum = flugdatum;
    }

    public void setFlugnummer(String flugnummer) {
        Objects.requireNonNull(flugnummer);
        this.flugnummer = flugnummer;
    }

    public void anzeigen()
    {
        if (getFlugdatum().getMonth() == Month.JANUARY)
        {

        }
    }
}


