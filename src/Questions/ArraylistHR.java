package Questions;

import java.util.*;

public class ArraylistHR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> line = new ArrayList<>();
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                line.add(sc.nextInt());
            }
            lines.add(line);
        }
        int o = sc.nextInt();
        for (int i = 0; i < o; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y > lines.get(x - 1).size()) {
                System.out.println("ERROR !");
            } else {
                System.out.println(lines.get(x - 1).get(y - 1));
            }

        }
        sc.close();
    }
}