public class MidiDiscount extends Rabattstrategie{
    private final double rabatt = 0.15;

    public MidiDiscount(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public double getReduzierterPreis(double regulaerPreis) {
        return regulaerPreis * (1-this.rabatt);
    }
}
