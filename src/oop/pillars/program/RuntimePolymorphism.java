package oop.pillars.program;

/**
 *
 * @author Hp
 */
class Bank {
    void interestRate() {
        System.out.println("General bank interest rate.");
    }

    void welcome() {
        System.out.println("Welcome to the bank.");
    }
}

class HBL extends Bank {
    @Override
    void interestRate() {
        System.out.println("HBL interest rate is 12%.");
    }
}

class UBL extends Bank {
    @Override
    void interestRate() {
        System.out.println("UBL interest rate is 11%.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Bank bank;

        bank = new HBL();
        System.out.println("HBL Bank");
        bank.welcome();
        bank.interestRate();

        System.out.println();

        bank = new UBL();
        System.out.println("UBL Bank");
        bank.welcome();
        bank.interestRate();
    }
}
