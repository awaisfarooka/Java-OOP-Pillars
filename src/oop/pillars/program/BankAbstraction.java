package oop.pillars.program;

/**
 *
 * @author Hp
 */
abstract class BankSystem {
    abstract void interestRate();

    void welcome() {
        System.out.println("Welcome to our bank.");
    }

    void accountInfo() {
        System.out.println("Bank account information.");
    }

    void service() {
        System.out.println("Banking service is available.");
    }
}

class MyBank extends BankSystem {
    @Override
    void interestRate() {
        System.out.println("Interest Rate: 12%");
    }
}

public class BankAbstraction {
    public static void main(String[] args) {
        MyBank bank = new MyBank();

        System.out.println("Bank Information");
        System.out.println("----------------");
        bank.welcome();
        bank.accountInfo();
        bank.service();
        bank.interestRate();
    }
}
