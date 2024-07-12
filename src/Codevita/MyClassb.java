package Codevita;

import java.util.*;
import java.util.stream.*;

public class MyClassb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear foot[] = new Footwear[5];
        for (int i = 0; i < 5; i++) {
            int footwearid = Integer.parseInt(sc.nextLine());
            String brandName = sc.nextLine();
            String footWearType = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());

            foot[i] = new Footwear(footwearid, brandName, footWearType, price);
        }

        String par1 = sc.nextLine();
        int res1 = getCountByType(foot, par1);
        if (res1 > 0)
            System.out.println(res1);
        else
            System.out.println("Footwear not available");
        String par2 = sc.nextLine();
        Footwear resFoot = getSecondHighestPriceByBrand(foot, par2);
        if (resFoot != null) {
            System.out.println(resFoot.getFootwearid());
            System.out.println(resFoot.getBrandName());
            System.out.println(resFoot.getPrice());
        } else {
            System.out.println("Brand not available");
        }
    }

    private static Footwear getSecondHighestPriceByBrand(Footwear[] foot, String par2) {
        Stream<Footwear> st = Arrays.stream(foot);
        List<Footwear> list = st.filter(x -> x.getBrandName().equalsIgnoreCase(par2))
                .sorted(Comparator.comparing(Footwear::getPrice).reversed()).collect(Collectors.toList());
        System.out.println(list);
        if (list.size() > 0)
            return list.get(1);
        else
            return null;
    }

    private static int getCountByType(Footwear[] foot, String par1) {
        Stream<Footwear> st = Arrays.stream(foot);
        int count = (int) st.filter(x -> x.getFootWearType().equalsIgnoreCase(par1)).count();
        return count;
    }
}

class Footwear {
    private int footwearid;
    private String brandName;
    private String footWearType;
    private int price;

    public Footwear(int footwearid, String brandName, String footWearType, int price) {
        this.footwearid = footwearid;
        this.brandName = brandName;
        this.footWearType = footWearType;
        this.price = price;
    }

    public int getFootwearid() {
        return footwearid;
    }

    public void setFootwearid(int footwearid) {
        this.footwearid = footwearid;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getFootWearType() {
        return footWearType;
    }

    public void setFootWearType(String footWearType) {
        this.footWearType = footWearType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Footwear [brandName=" + brandName + ", footWearType=" + footWearType + ", footwearid=" + footwearid
                + ", price=" + price + "]";
    }

}
