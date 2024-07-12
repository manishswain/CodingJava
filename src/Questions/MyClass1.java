package Questions;

import java.util.*;

public class MyClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        String temp = sc.nextLine();
        while (!temp.equals("q")) {
            double d = Double.parseDouble(temp);
            list.add(d);
            temp = sc.nextLine();

        }
        for (int i = 0; i < list.size(); i++) {
            if (Double.compare(list.get(i), 42.195) == 0) {
                list.set(i, 0.0);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                System.out.print(list.get(i) + " ");
            }
        }
        sc.close();
    }
}
