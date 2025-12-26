package ex001;

public class Ticket {
    private double value;
    private String movieName;
    private String subtitle;

    public Ticket(double value, String movieName, String subtitle) {
        this.value = value;
        this.movieName = movieName;
        this.subtitle = subtitle;
    }

    public double getRealValue() {
        return value;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getSubtitle() {
        return subtitle;
    }
    
}
