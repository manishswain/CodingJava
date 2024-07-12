package Test;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int id = sc.nextInt();
        double balance = sc.nextDouble();
        double interestRate = sc.nextDouble();
        
        Account act = new Account(id, balance, interestRate);

        int noOfYears = sc.nextInt();

        double answer = calculateInterest(act, noOfYears);
        System.out.printf(String.format("%.3f", answer));
        sc.close();

    }

    private static double calculateInterest(Account act, int noOfYears) {
        double tempRate = act.getInterestRate();
        double intRate = (tempRate * noOfYears) / 100;
        tempRate += intRate;
        double result = (act.getBalance() * tempRate) / 100;
        return result;
    }
}

class Account {
    private int id;
    private double balance;
    private double interestRate;

    public Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
