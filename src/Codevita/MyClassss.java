package Codevita;

import java.util.*;
import java.util.stream.Stream;

public class MyClassss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceCenter scr[] = new ServiceCenter[4];
        for (int i = 0; i < 4; i++) {
            String serviceCenterName = sc.nextLine();
            String branch = sc.nextLine();
            double amountCharged = Double.parseDouble(sc.nextLine());
            boolean availableOnline = Boolean.parseBoolean(sc.nextLine());

            scr[i] = new ServiceCenter(serviceCenterName, branch, amountCharged, availableOnline);
        }
        String par1 = sc.nextLine();
        double ans = findAvgCostOnlineServiceCenter(scr);
        if (Double.compare(ans, 0.0) == 0) {
            System.out.println("No center is available online");
        } else {
            System.out.println(ans);
        }
        ServiceCenter scrAns[] = findAServiceCenters(scr, par1);
        if (scrAns != null) {
            for (ServiceCenter fin : scrAns) {
                System.out.println(fin.getServiceCenterName());
                System.out.println(fin.getAmountCharged());
            }
        } else {
            System.out.println("Branch name is not starting with the given letter");
        }
    }
    private static double 
findAvgCostOnlineServiceCenter(ServiceCenter[] scr) {
        Stream<ServiceCenter> stream = Arrays.stream(scr);
        ServiceCenter scrAns[] = stream.filter(x -> x.isAvailableOnline()).toArray(ServiceCenter[]::new);
        if (scrAns.length == 0) {
            return 0.0;
        }
        stream = Arrays.stream(scr);
        double ans = stream.filter(x -> x.isAvailableOnline()).map(x -> x.getAmountCharged()).mapToDouble(x -> x)
                .average().getAsDouble();
        return ans;
    }
    private static ServiceCenter[] findAServiceCenters(ServiceCenter[] scr, String par1) {
        Stream<ServiceCenter> stream = Arrays.stream(scr);
        ServiceCenter scrAns[] = stream.filter(x -> x.getBranch().startsWith(par1))
                .sorted(Comparator.comparing(ServiceCenter::getAmountCharged).reversed()).toArray(ServiceCenter[]::new);
        if (scrAns.length != 0)
            return scrAns;
        return null;
    }
}

class ServiceCenter {

    private String serviceCenterName;
    private String branch;
    private double amountCharged;
    private boolean availableOnline;

    public ServiceCenter(String serviceCenterName, String branch, double amountCharged, boolean availableOnline) {
        this.serviceCenterName = serviceCenterName;
        this.branch = branch;
        this.amountCharged = amountCharged;
        this.availableOnline = availableOnline;
    }
    public String getServiceCenterName() {
        return serviceCenterName;
    }
    public void setServiceCenterName(String serviceCenterName) {
        this.serviceCenterName = serviceCenterName;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public double getAmountCharged() {
        return amountCharged;
    }
    public void setAmountCharged(double amountCharged) {
        this.amountCharged = amountCharged;
    }
    public boolean isAvailableOnline() {
        return availableOnline;
    }
    public void setAvailableOnline(boolean availableOnline) {
        this.availableOnline = availableOnline;
    }
    @Override
    public String toString() {
        return "ServiceCenter [amountCharged=" + amountCharged + ", availableOnline=" + availableOnline + ", branch="
                + branch + ", serviceCenterName=" + serviceCenterName + "]";
    }
    
}