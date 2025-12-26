
/* Write a code where we have a bank account that can perform the following operations:
   - Check balance
   - Check special check (overdraft)
   - Deposit money
   - Withdraw money
   - Pay a bill
   - Check if the account is using the special check (overdraft)

Follow the following rules for implementation:
- The bank account must have a special check limit added to the account balance;
- The special check value is defined at the time of account creation, based on the amount deposited into the account when it was created;
- If the deposit amount at account creation is R$500.00 or less, the special check must be R$500.00;
- For amounts above R$500.00, the special check must be 50% of the deposited amount;
- If the special check limit is used, the account must charge a fee of 20% on the amount used from the special check.
 */

 package ex001;

 import java.util.Scanner;
 import java.util.InputMismatchException;

 
 public class Main {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the initial deposit amount to create the account: R$");
            double initialDeposit = -1;
            while (initialDeposit < 0) {
                try {
                    initialDeposit = scanner.nextDouble();
                    if (initialDeposit < 0) {
                        System.out.print("Initial deposit cannot be negative. Please enter a valid amount: R$");
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter a number: R$");
                    scanner.next(); 
                }
            }

            BankAccount account = new BankAccount(initialDeposit);
            System.out.println("Account created successfully!");
            interactiveMenu(account, scanner);
        }
    }

    private static void interactiveMenu(BankAccount account, Scanner scanner) {
        int option = 0;
        do {
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Check Overdraft Limit");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Pay a Bill");
            System.out.println("6. Check if Using Special Check (Overdraft)");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            try {
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.printf("Current balance: R$%.2f%n", account.getBalance());
                        System.out.printf("Available with overdraft: R$%.2f%n", account.getAvailableBalance());
                        break;
                    case 2:
                        System.out.printf("Your overdraft limit is: R$%.2f%n", account.getSpecialCheckLimit());
                        break;
                    case 3:
                        System.out.print("Enter the amount to deposit: R$");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.print("Enter the amount to withdraw: R$");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 5:
                        System.out.print("Enter the bill amount to pay: R$");
                        double billAmount = scanner.nextDouble();
                        account.payBill(billAmount);
                        break;
                    case 6:
                        if (account.isUsingSpecialCheck()) {
                            System.out.println("The account is currently using the special check (overdraft).");
                        } else {
                            System.out.println("The account is not using the special check (overdraft).");
                        }
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number corresponding to the menu option.");
                scanner.next(); 
                option = 0; 
            }
        } while (option != 7);
    }
}