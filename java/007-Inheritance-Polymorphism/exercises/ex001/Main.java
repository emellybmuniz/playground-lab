package ex001;
/* Create a class hierarchy to handle the types of tickets that can be sold in a cinema. The ticket must have a value, the movie name, and indicate if it is dubbed or subtitled. From this ticket, the HalfPriceTicket and FamilyTicket types must be created. Each ticket must have a method that returns its real value (based on the value informed at the ticket's creation). For half-price tickets, its value must be half of the original value. For family tickets, the value should be returned multiplied by the number of people, and a 5% discount should be provided when the number of people is greater than 3. */

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(20.0, "The Nun", "Dubbed");
        HalfPriceTicket halfPriceTicket1 = new HalfPriceTicket(20.0, "Movie B", "Subtitled");
        FamilyTicket familyTicket1 = new FamilyTicket(20.0, "Movie C", "Dubbed", 4);

        System.out.println("Ticket 1: " + ticket1.getRealValue());
        System.out.println("Half Price Ticket 1: " + halfPriceTicket1.getRealValue());
        System.out.println("Family Ticket 1: " + familyTicket1.getRealValue());
    }
}