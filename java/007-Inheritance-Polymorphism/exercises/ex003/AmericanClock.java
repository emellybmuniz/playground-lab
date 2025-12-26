package ex003;

public class AmericanClock extends Clock {

    public AmericanClock(int hour, int minute, int second) {
        super(hour, minute, second);
    }

    @Override
    public void display() {
        String period = (getHour() >= 12) ? "PM" : "AM";
        int displayHour = (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12;
        System.out.printf("%02d:%02d:%02d %s\n", displayHour, getMinute(), getSecond(), period);
    }
}