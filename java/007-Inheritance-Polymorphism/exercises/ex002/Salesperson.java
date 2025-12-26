package ex002;

public class Salesperson extends User {
    private int salesQuantity;
    private final boolean isAdmin = false;

    public Salesperson(String name, String email, String password) {
        super(name, email, password);
        this.salesQuantity = 0;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void makeSale() {
        this.salesQuantity++;
        System.out.println("Sale made! Current sales: " + this.salesQuantity);
    }

    public void checkSales() {
        System.out.println("Total sales: " + this.salesQuantity);
    }
}