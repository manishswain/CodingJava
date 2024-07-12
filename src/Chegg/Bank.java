package Chegg;

//Importing the util.List as importing ArrayList throws AbstractList Error.
import java.util.List;

//Transaction interface from which savings and checking class inherits.
interface Transactions {
    void withdraw(double amount);

    void deposit(double amount);
}

// This class contains the functionality of creating a bankAccount of savings or
// checking type.
class Bank {
    private List<Transactions> accounts;
    private int size;

    Bank(int size) {
        this.size = size;
    }

    void addAccount(Transactions account) {
        accounts.add(account);
    }
    //method for returning the maximum saving balance.
    double maxSavingsBalance() {
        this.accounts.sort((o1, o2) -> (int) ((Savings) o1).getBalance() - (int) ((Savings) o2).getBalance());//Logic of Comparator.
        double val = ((Savings) accounts.get(accounts.size() - 1)).getBalance();
        return val > 0 ? val : 0;
    }
}

// This class is for handling all the savings account logic
class Savings implements Transactions {
    private double balance;
    private int accountNumber;
    private double reward;

    Savings(int accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0)
            return;

        if (amount < this.balance) {
            this.balance = balance - amount;
        } else {
            throw new RuntimeException("Withdraw Amount Exceeded");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0)
            return;
        this.balance = balance + (0.01 * amount);
        this.reward = reward + (0.01 * amount);
    }
}

// This class is for handling all the checking account logic
class Checking implements Transactions {
    private double balance;
    private int accountNumber;
    private double OVERDRAFT_FEE;

    Checking(int accountNumber) {
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0)
            return;
        if (balance < amount && balance > 0) {
            double overhead = amount - balance;
            this.balance = overhead - (0.05 * overhead);
            this.OVERDRAFT_FEE = overhead - (0.05 * overhead);

        } else if (amount < balance) {
            this.balance = balance - amount;
        } else if (balance < 0) {
            this.balance = balance - (amount * 0.05);
            this.OVERDRAFT_FEE = OVERDRAFT_FEE - (amount * 0.05);
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0)
            return;
        this.balance = balance + amount;
    }
}
