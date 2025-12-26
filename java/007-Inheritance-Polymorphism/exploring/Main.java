public class Main {
    public static void main(String[] args) {
        // We cannot instantiate an abstract class:
        // Employee emp = new Employee("Test", 0); // This would cause a compilation error.

        // Creating an array of Employee (polymorphism)
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("Carlos", 101, "IT");
        employees[1] = new Intern("Beatriz", 202, "USP");
        employees[2] = new Director("Alice", 1, "Executive", 10000.0);

        System.out.println("--- Employee Details ---");
        for (Employee emp : employees) {
            // Polymorphism: the getDetails() method called is the one from the object's actual class.
            System.out.println(emp.getDetails());

            // getCanonicalName(): Returns the canonical (full) name of the object's class.
            System.out.println("   Class: " + emp.getClass().getCanonicalName());
            System.out.println("   Salary: " + emp.calculateSalary());

            // instanceof: Checks if an object is an instance of a specific class.
            // Useful for treating objects differently based on their actual type.
            if (emp instanceof Manager) {
                System.out.println("   -> Is a manager or director.");
                // ((Manager)employee): Type casting (downcasting).
                // Necessary to call methods that only exist in the Manager class (or subclasses).
                Manager mgr = (Manager) emp;
                mgr.approveExpense(); // Method of the Manager class
            }

            // A Director is also a Manager, so the block above also executes for it.
            // We can have a more specific check.
            if (emp instanceof Director) {
                System.out.println("   -> Is also a director.");
                Director dir = (Director) emp;
                // Calling the overloaded method from the Director class
                dir.approveExpense(5000.0);
            }

            System.out.println("--------------------");
        }
    }
}

/**
 * abstract: The class cannot be instantiated directly.
 * It serves as a template (contract) for other classes.
 */
abstract class Employee {
    // protected: Accessible within the same package and by subclasses in different packages.
    // It's a middle ground between 'private' and 'public'.
    protected String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method that can be overridden by subclasses
    public String getDetails() {
        return "ID: " + id + ", Name: " + name;
    }

    // Abstract method forces subclasses to provide an implementation.
    public abstract double calculateSalary();
}

/**
 * sealed: Sealed class. Restricts inheritance.
 * Only the classes listed in 'permits' can extend it.
 * Subclasses must be 'final', 'sealed', or 'non-sealed'.
 */
sealed class Manager extends Employee permits Director {
    private String department;

    public Manager(String name, int id, String department) {
        // super: Calls the constructor of the parent class (Employee).
        // Must be the first statement in the subclass's constructor.
        super(name, id);
        this.department = department;
    }

    /**
     * @Override: Annotation that indicates this method is overriding a method from the parent class.
     * Helps prevent errors (e.g., misspelling the method name).
     */
    @Override
    public String getDetails() {
        // super.getDetails(): Calls the implementation of the parent class's method
        // to reuse its behavior and just add new information.
        return super.getDetails() + ", Department: " + department;
    }

    @Override
    public double calculateSalary() {
        return 5000.0;
    }

    // Manager-specific method
    public void approveExpense() {
        System.out.println("   (Manager Action) Generic expense approved by " + name);
    }
}

/**
 * non-sealed: Breaks the "sealing chain".
 * Allows the Director class to be freely extended by any other class.
 */
non-sealed class Director extends Manager {
    private double bonus;

    public Director(String name, int id, String department, double bonus) {
        super(name, id, department);
        this.bonus = bonus;
    }

    @Override
    public String getDetails() {
        // Example of how to build upon the parent class's behavior.
        // "DDD" + super.getCode() would be a similar example, concatenating something
        // to the result of the superclass's method.
        return super.getDetails() + ", Bonus: " + bonus;
    }

    @Override
    public double calculateSalary() {
        // Reusing the Manager's calculation and adding the bonus.
        return super.calculateSalary() + bonus;
    }

    /**
     * Method Overloading:
     * Same method name 'approveExpense' as in the Manager class, but with a different signature (different parameters).
     * The compiler knows which one to call based on the provided arguments.
     */
    public void approveExpense(double amount) {
        System.out.println("   (Director Action) Expense of $" + amount + " approved by " + name);
    }
}

/**
 * final: Prevents the class from being extended (cannot have subclasses).
 * Useful for classes that represent immutable or complete concepts.
 */
final class Intern extends Employee {
    private String university;

    public Intern(String name, int id, String university) {
        super(name, id);
        this.university = university;
    }

    @Override
    public String getDetails() {
        // Accessing the 'protected String name' field from the parent class directly.
        return super.getDetails() + ", University: " + university + " (Intern: " + this.name + ")";
    }

    @Override
    public double calculateSalary() {
        return 1500.0;
    }
}
