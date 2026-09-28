package oop.pillars.program;

/**
 *
 * @author Hp
 */
public class BankEncapsulation {

    class BankAccount {
        private String accountHolder;
        private double balance;

        public void setAccountHolder(String name) {
            accountHolder = name;
        }

        public void setBalance(double amount) {
            balance = amount;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance = balance + amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance = balance - amount;
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }

    public static void main(String[] args) {
        BankEncapsulation obj = new BankEncapsulation();
        BankAccount account = obj.new BankAccount();

        account.setAccountHolder("Awais");
        account.setBalance(50000);
        account.deposit(10000);
        account.withdraw(5000);

        System.out.println("Bank Account Information");
        System.out.println("------------------------");
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: " + account.getBalance());
    }
}
