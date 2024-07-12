package Test;

import java.util.*;

class Implementation {

    public ArrayList<String> changeOccurrence(ArrayList<String> list, String a, String b) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(a)) {
                list.set(i, b);
            }
        }
        return list;
    }

    public String getIndex(ArrayList<String> list) {
        return list.get(0);
    }

    public ArrayList<String> addAfter(ArrayList<String> list, String a, String b) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(a)) {
                list.add(i + 1, b);
            }
        }
        return list;
    }
}

public class Solution25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Implementation imp = new Implementation();
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(imp.changeOccurrence(list, "B", "S"));
        System.out.println(imp.getIndex(list));
        System.out.println(imp.addAfter(list, "B", "S"));
    }
}
