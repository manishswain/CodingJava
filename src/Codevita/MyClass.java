package Codevita;

import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>(
                Arrays.asList("TempleJewelry", "KundanJewelry", "HandmadeJewelry", "NavratnaJewelry"));
        System.out.println("Enter the customer name");
        String name = sc.nextLine();
        System.out.println("Enter the category");
        String cat = sc.nextLine();
        if (!list.contains(cat)) {
            String s1 = cat.replace("Jewelry","");
            System.out.println(s1 + " Jewelry is an invalid category");
            return;
        }
        System.out.println("Enter the quantity of the gold ordered");
        int num = sc.nextInt();
        if (num < 1) {
            System.out.println(num + " is an invalid quantity");
            return;
        }
        double cost = 0;
        int dist = 0;
        switch (cat) {
            case "TempleJewelry": {
                if (num >= 20)
                    dist = 15;
                break;
            }
            case "KundanJewelry": {
                if (num >= 25)
                    dist = 10;
                break;
            }
            case "HandmadeJewelry": {
                if (num >= 30)
                    dist = 8;
                break;
            }
            case "NavratnaJewelry": {
                if (num >= 35)
                    dist = 13;
                break;
            }
        }
        if (dist != 0) {
            cost = (num * 36789) - (((double) num * 36789) * dist) / 100;
        } else {
            cost = num * 36789;
        }
        System.out.println(String.format("%.2f", cost));
    }
}