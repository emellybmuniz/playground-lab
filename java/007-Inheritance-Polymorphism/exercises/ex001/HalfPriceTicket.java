package ex001;

public class HalfPriceTicket extends Ticket {

    public HalfPriceTicket(double value, String movieName, String subtitle) {
        super(value, movieName, subtitle);
    }

    @Override
    public double getRealValue() {
        return super.getRealValue() / 2;
    }
}
