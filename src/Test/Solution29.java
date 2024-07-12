package Test;

import java.util.*;
import java.util.stream.*;

public class Solution29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Maize maz[] = new Maize[4];
        for (int i = 0; i < 4; i++) {
            String maizeType = sc.nextLine();
            String maizeName = sc.nextLine();
            double protein = Double.parseDouble(sc.nextLine());
            int price = Integer.parseInt(sc.nextLine());

            maz[i] = new Maize(maizeType, maizeName, protein, price);
        }
        String par1 = sc.nextLine();
        double res = averageProteinByType(maz, par1);
        if (Double.compare(res, 0.0) == 0) {
            System.out.println("There is no such Maize available.");
        } else {
            System.out.println(res);
        }
        int par2 = Integer.parseInt(sc.nextLine());
        Maize ans[] = sortMaizeByPrice(maz, par2);
        if (ans != null) {
            for (Maize m : ans) {
                System.out.println(m.getMaizeName());
            }
        } else {
            System.out.println("No Maize found.");
        }
    }

    private static double averageProteinByType(Maize[] maz, String par1) {
        Stream<Maize> stream = Arrays.stream(maz);
        OptionalDouble ans = stream.filter(x -> x.getMaizeType().equalsIgnoreCase(par1))
                .mapToDouble(x -> x.getProtein()).average();
        if (ans.isPresent()) {
            return ans.getAsDouble();
        } else {
            return 0.0;
        }
    }

    private static Maize[] sortMaizeByPrice(Maize[] maz, int par2) {
        Stream<Maize> stream = Arrays.stream(maz);
        Maize ans[] = stream.filter(x -> x.getPrice() < par2).sorted(Comparator.comparing(Maize::getPrice))
                .toArray(Maize[]::new);
        if (ans.length > 0) {
            return ans;
        } else {
            return null;
        }
    }

}

class Maize {
    private String maizeType;
    private String maizeName;
    private double protein;
    private int price;

    public Maize(String maizeType, String maizeName, double protein, int price) {
        this.maizeType = maizeType;
        this.maizeName = maizeName;
        this.protein = protein;
        this.price = price;
    }

    public String getMaizeType() {
        return maizeType;
    }

    public String getMaizeName() {
        return maizeName;
    }

    public double getProtein() {
        return protein;
    }

    public int getPrice() {
        return price;
    }
}