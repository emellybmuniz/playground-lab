package ex001; // this is the package declaration, is necessary for organizing classes.

public class BankAccount {
    private static final double MIN_DEPOSIT_FOR_PERCENTAGE_LIMIT = 500.00;
    private static final double FIXED_OVERDRAFT_LIMIT = 500.00;
    private static final double OVERDRAFT_LIMIT_PERCENTAGE = 0.50;
    private static final double OVERDRAFT_FEE_PERCENTAGE = 0.20;
    // final static variables need to be constants and named in uppercase with underscores.
    // It's used to define values that won't change and are shared across all instances of the class.
    // In this exercise, It's a good ideia to use them! :)

    private double balance;
    private double specialCheckLimit;

    public BankAccount(double initialDeposit) {
        this.balance = initialDeposit;

        if (initialDeposit <= MIN_DEPOSIT_FOR_PERCENTAGE_LIMIT) {
            this.specialCheckLimit = FIXED_OVERDRAFT_LIMIT;
        } else {
            this.specialCheckLimit = initialDeposit * OVERDRAFT_LIMIT_PERCENTAGE;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }

        double availableAmount = this.balance + this.specialCheckLimit;

        if (amount > availableAmount) {
            System.out.println("Insufficient fund.");
            return;
        }

        double overdraftUsedInThisTransaction = 0;
        if (this.balance < amount) {

            overdraftUsedInThisTransaction = (this.balance > 0) ? (amount - this.balance) : amount;
        }

        this.balance -= amount;
        System.out.printf("Withdrawal of R$%.2f successful.%n", amount);

        if (overdraftUsedInThisTransaction > 0) {
            double fee = overdraftUsedInThisTransaction * OVERDRAFT_FEE_PERCENTAGE;
            this.balance -= fee;
            System.out.printf("You used R$%.2f from your overdraft. An overdraft fee of R$%.2f was applied.%n", overdraftUsedInThisTransaction, fee);
        }
    }

    public void payBill(double amount) {
        System.out.printf("Attempting to pay bill of R$%.2f...%n", amount);
        withdraw(amount);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Deposit of R$%.2f successful.%n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Getteres needs to only return values, without changing the object's state.

    public boolean isUsingSpecialCheck() {
        return this.balance < 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getSpecialCheckLimit() {
        return this.specialCheckLimit;
    }

    public double getAvailableBalance() {
        return this.balance + this.specialCheckLimit;
    }
}
