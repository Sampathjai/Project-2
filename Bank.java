import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String accountNumber, String accountHolder) {
        BankAccount account = new BankAccount(accountNumber, accountHolder);
        accounts.add(account);
        System.out.println("Account created successfully!");
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }

    public void displayAllAccounts() {
        System.out.println("All Bank Accounts:");
        for (BankAccount account : accounts) {
            System.out.println(account.getAccountNumber() + " - " + account.getAccountHolder() + " - $" + account.getBalance());
        }
    }
}
