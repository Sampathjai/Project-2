import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n=== Simple Banking System ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Display All Accounts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNumber = sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();
                    bank.createAccount(accNumber, name);
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accNumber = sc.nextLine();
                    BankAccount account = bank.findAccount(accNumber);
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        account.deposit(amount);
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accNumber = sc.nextLine();
                    account = bank.findAccount(accNumber);
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        account.withdraw(amount);
                    }
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accNumber = sc.nextLine();
                    account = bank.findAccount(accNumber);
                    if (account != null) {
                        System.out.println("Current Balance: $" + account.getBalance());
                    }
                    break;
                case 5:
                    System.out.print("Enter Account Number: ");
                    accNumber = sc.nextLine();
                    account = bank.findAccount(accNumber);
                    if (account != null) {
                        account.printTransactionHistory();
                    }
                    break;
                case 6:
                    bank.displayAllAccounts();
                    break;
                case 0:
                    System.out.println("Thank you for using the Banking System!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
