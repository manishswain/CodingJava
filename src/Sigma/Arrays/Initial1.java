package Arrays;

import java.util.Arrays;

public class Initial1 {
    public static void main(String[] args) {
        int marks[] = { 98, 99, 100 };
        int primiNonChangable = 9;
        Integer nonchangable = 9;
        update(marks, primiNonChangable, nonchangable);
        System.out.println(Arrays.toString(marks));
        System.out.println(primiNonChangable);
        System.out.println(nonchangable);
    }

    public static void update(int marks[], int primiNonChangable, Integer nonchangable) {
        primiNonChangable = 10;
        nonchangable = 100;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }
}
