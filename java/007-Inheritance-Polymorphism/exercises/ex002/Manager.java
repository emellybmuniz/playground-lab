package ex002;

public class Manager extends User {
    private final boolean isAdmin = true;

    public Manager(String name, String email, String password) {
        super(name, email, password);
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void generateFinancialReport() {
        System.out.println("Financial report generated.");
    }

    public void consultSales() {
        System.out.println("Sales consulted.");
    }
}
