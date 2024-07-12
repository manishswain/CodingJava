package Codevita;

import java.util.Random;

public class Shoaib {
    public static void main(String[] args) {

        String res = printAfterSubstitute("How can I open a {account_type}");
        System.out.println(res);
    }

    private static String printAfterSubstitute(String query) {
        String[] str = new String[] { "Savings Account", "Salary Account", "Current Account", "Rural Account",
                "Public Provident Fund Account", "Sukanya Samridhi Account", "Demat Account", "Fixed Deposit",
                "Non Withdrawal Deposit", "Recurring Deposit", "My Passion Fund" };
        Random random = new Random();
        int next = random.nextInt(str.length);
        String res = query.replace("{account_type}", str[next]);
        return res;
    }
}
