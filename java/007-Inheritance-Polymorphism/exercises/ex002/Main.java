package ex002;

/*
 * Create a hierarchy of classes that define the types of users in a system, using the following requirements:
 * 
Manager class, which will have the following attributes: Name, Email, Password, and an attribute that indicates whether the user is an administrator, which must always be true;

Salesperson class, which will have the following attributes: Name, Email, Password, Sales quantity, and an attribute that indicates whether they are an administrator, which must always be false;

Attendant class, which will have the following attributes: Name, Email, Password, Cash value, and an attribute that indicates whether they are an administrator, which must always be false.
Each class must have its respective getters and setters (for attributes that make sense to have) and the classes must have the following methods
The Manager class must have the methods Generate financial report, Consult sales, Log in, Log out, Change data, Change password;

The Salesperson class must have the methods Make sale (increase the number of sales when triggered), Check sales, Log in, Log out, Change data, Change password;
The Attendant class must have the methods Receive payments (where the method receives an amount that must be added to the cash amount), Close cash register, Log in, Log out, Change data, and Change password;
 */

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Carlos Silva", "carlos.silva@example.com", "managerPass123");

        Salesperson salesperson1 = new Salesperson("Ana Pereira", "ana.pereira@example.com", "salesPass1");

        Attendant attendant1 = new Attendant("Mariana Oliveira", "mariana.o@example.com", "attendantPass1");

        Salesperson salesperson = salesperson1;
        Attendant attendant = attendant1;

        // Test Manager functionalities
        System.out.println("--- Manager Actions ---");
        manager.login("carlos.silva@example.com", "managerPass123");
        manager.generateFinancialReport();
        manager.consultSales();
        manager.changeData("Carlos Alberto Silva", "carlos.a.silva@example.com");
        manager.changePassword("newManagerPass");
        manager.logout();
        System.out.println("Manager Name: " + manager.getName() + ", Email: " + manager.getEmail() + ", Is Admin: " + manager.isAdmin());
        System.out.println();

        // Test Salesperson functionalities
        System.out.println("--- Salesperson Actions ---");
        salesperson.login("ana.pereira@example.com", "salesPass1");
        salesperson.makeSale();
        salesperson.makeSale();
        salesperson.checkSales();
        salesperson.changeData("Ana Clara Pereira", "ana.c.pereira@example.com");
        salesperson.changePassword("newSalesPass");
        salesperson.logout();
        System.out.println("Salesperson Name: " + salesperson.getName() + ", Email: " + salesperson.getEmail() + ", Sales Quantity: " + salesperson.getSalesQuantity() + ", Is Admin: " + salesperson.isAdmin());
        System.out.println();

        // Test Attendant functionalities
        System.out.println("--- Attendant Actions ---");
        attendant.login("mariana.o@example.com", "attendantPass1");
        attendant.receivePayments(100.50);
        attendant.receivePayments(50.25);
        attendant.closeCashRegister();
        attendant.changeData("Mariana Costa Oliveira", "mariana.co@example.com");
        attendant.changePassword("newAttendantPass");
        attendant.logout();
        System.out.println("Attendant Name: " + attendant.getName() + ", Email: " + attendant.getEmail() + ", Is Admin: " + attendant.isAdmin());
        System.out.println();
    }
}
