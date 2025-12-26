package ex001;

public class FamilyTicket extends Ticket {
    private int numberOfPeople;

    public FamilyTicket(double value, String movieName, String subtitle, int numberOfPeople) {
        super(value, movieName, subtitle);
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public double getRealValue() {
        double totalValue = super.getRealValue() * this.numberOfPeople;

  
        if (this.numberOfPeople > 3) {
            totalValue *= 0.95;
        }
        return totalValue;
    }
}