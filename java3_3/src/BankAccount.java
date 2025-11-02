public class BankAccount {
    private static int totalAccounts;
    private int accountNumber;
    private double balance;
    private int accounts;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.accounts = ++totalAccounts;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if  (balance >= amount) {
        balance -= amount;
        } else {
            amount = 0;
        }
    }

    double getBalance() {
        return balance;
    }

    String getAccountNumber() {
        //return accountNumber;
        return String.valueOf(accountNumber);
    }

    static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(1500);
        account1.withdraw(300);
        account2.deposit(1000);
        account2.withdraw(800);


        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }

}