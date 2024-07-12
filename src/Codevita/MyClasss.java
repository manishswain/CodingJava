package Codevita;
import java.util.*;

public class MyClasss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Granite granite[] = new Granite[4];
        for (int i = 0; i < 4; i++) {
             int graniteId=sc.nextInt();
             sc.nextLine();
             String graniteName=sc.nextLine();
             String graniteUse=sc.nextLine();
             int pricePerSqFt=sc.nextInt();
             sc.nextLine();
            String quality=sc.nextLine();
            granite[i]=new Granite(graniteId, graniteName, graniteUse, pricePerSqFt, quality);
        }
        String par1 = sc.nextLine();
        int par2=sc.nextInt();
        sc.nextLine();
        String par3 =sc.nextLine();
        double totPrice = getTotalPriceBasedOnSqFt(granite,par1,par2);
        if(totPrice == 0)
            System.out.println("Granite Name is not found");
        else
            System.out.println(totPrice);


        Granite secLow =findGraniteBasedOnQuality(granite,par3);
        if(secLow == null)
            System.out.println("There is no matching granite with the given quality");
        else
        {
            System.out.println(secLow.getGraniteName());
            System.out.println(secLow.getQuality());
            System.out.println(secLow.getPricePerSqFt());
        }

    }

    private static Granite findGraniteBasedOnQuality(Granite[] granite, String par3) {
       List<Granite> qual = new ArrayList<>();
       Granite res = null ;
       for(Granite g : granite)
       {
           if(g.getQuality().equalsIgnoreCase(par3))
           {
               qual.add(g);
           }
       }
       if(qual.size() == 0)
        return res;

        else
        {
            Collections.sort(qual,(Granite o1,Granite o2)-> o1.getPricePerSqFt()-o2.getPricePerSqFt());
            res = qual.get(1);
        }
        return res;
    }

    private static double getTotalPriceBasedOnSqFt(Granite[] granite, String par1, int par2) {
        int sqft = 0;
        double total = 0;
        boolean c = false;
        for(Granite g : granite)
        {
            if(g.getGraniteName().equalsIgnoreCase(par1))
            {
                sqft = g.getPricePerSqFt();
                c = true;
            }
        }
        if(c == true)
        total = sqft*par2 + (0.2*par2);

        return total;
    }

}

class Granite {
    private int graniteId;
    private String graniteName;
    private String graniteUse;
    private int pricePerSqFt;
    private String quality;

    public int getGraniteId() {
        return graniteId;
    }

    public void setGraniteId(int graniteId) {
        this.graniteId = graniteId;
    }

    public String getGraniteName() {
        return graniteName;
    }

    public void setGraniteName(String graniteName) {
        this.graniteName = graniteName;
    }

    public String getGraniteUse() {
        return graniteUse;
    }

    public void setGraniteUse(String graniteUse) {
        this.graniteUse = graniteUse;
    }

    public int getPricePerSqFt() {
        return pricePerSqFt;
    }

    public void setPricePerSqFt(int pricePerSqFt) {
        this.pricePerSqFt = pricePerSqFt;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Granite(int graniteId, String graniteName, String graniteUse, int pricePerSqFt, String quality) {
        this.graniteId = graniteId;
        this.graniteName = graniteName;
        this.graniteUse = graniteUse;
        this.pricePerSqFt = pricePerSqFt;
        this.quality = quality;
    }

}