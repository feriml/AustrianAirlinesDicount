import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

public class Angebot {

    private double preis;

    private LocalDate flugdatum;

    private String flugnummer;

    private Rabattstrategie rabattstrategie;

    public Angebot(double preis, LocalDate flugdatum, String flugnummer) {
        setPreis(preis);
        setFlugdatum(flugdatum);
        setFlugnummer(flugnummer);
        setRabattstrategie();
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

    public double getReduzierterPreis(){
        return this.rabattstrategie.getReduzierterPreis(this.preis);
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

    @Override
    public String toString() {
        return "Angebot" + " Flugnummer: " + getFlugnummer() + " Flugdatum: "
                + getFlugdatum() + " Flugpreis: " + getPreis();
    }

    public void setRabattstrategie()
    {
        if (getFlugdatum().getMonth() == Month.JANUARY || getFlugdatum().getMonth() == Month.APRIL ||
                getFlugdatum().getMonth() == Month.OCTOBER)
        {
            this.rabattstrategie = new MaxiDiscount("Maxi Discount");
        }
        else if (getFlugdatum().getMonth() == Month.FEBRUARY || getFlugdatum().getMonth() == Month.MARCH)
        {
            this.rabattstrategie = new MidiDiscount("Midi Discount");
        }
        else
        {
            this.rabattstrategie = new ZeroDiscount("Zero Discount");
        }

    }
}


