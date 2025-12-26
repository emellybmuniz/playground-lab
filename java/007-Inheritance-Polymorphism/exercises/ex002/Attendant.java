package ex002;

public class Attendant extends User {
    private double cashValue;
    private final boolean isAdmin = false;

    public Attendant(String name, String email, String password) {
        super(name, email, password);
        this.cashValue = 0.0;
    }

    public double getCashValue() {
        return cashValue;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void receivePayments(double amount) {
        this.cashValue += amount;
        System.out.println("Payment received. Current cash value: " + this.cashValue);
    }

    public void closeCashRegister() {
        System.out.println("Cash register closed. Final cash value: " + this.cashValue);
        this.cashValue = 0.0;
    }
}
