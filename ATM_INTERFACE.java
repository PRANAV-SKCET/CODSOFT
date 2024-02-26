import java.util.*;

class Account {
    private int account_number;
    private float balance;

    public void add_account(int account_number, float balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return account_number;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            System.exit(0);
        } else {
            balance -= amount;
        }
    }
}

class ATM_INTERFACE {
    public static void main(String[] args) {
        Account[] acc = new Account[20];

        for (int i = 0; i < 20; i++) {
            acc[i] = new Account();
            acc[i].add_account(1000 + i, 1000.0f + i * 100);
        }

        System.out.println("Enter your Account Number");
        Scanner s = new Scanner(System.in);
        int acn = s.nextInt();

        Account account = null;
        for (int i = 0; i < 20; i++) {
            if (acn == acc[i].getAccountNumber()) {
                account = acc[i];
                break;
            }
        }

        if (account == null) {
            System.out.println("Account Number doesn't exist!!!");
            System.exit(0);
        }

        System.out.println("Press 1 for Balance Checking");
        System.out.println("Press 2 for Deposit");
        System.out.println("Press 3 for Withdrawal");
        System.out.println("Press 4 for Cancel the Transaction");

        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your balance is Rs." + account.getBalance());
                break;
            case 2:
                System.out.println("Enter the amount to deposit: ");
                float depositAmount = s.nextFloat();
                account.deposit(depositAmount);
                System.out.println("Deposit successful!");
                System.out.println("Your current balance is Rs." + account.getBalance());
                break;
            case 3:
                System.out.println("Enter the amount to withdraw: ");
                float withdrawAmount = s.nextFloat();
                account.withdraw(withdrawAmount);
                System.out.println("Collect the cash!!!");
                System.out.println();
                System.out.println("Your current balance is Rs." + account.getBalance());
                break;
            case 4:
                System.out.println("Transaction cancelled.");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
