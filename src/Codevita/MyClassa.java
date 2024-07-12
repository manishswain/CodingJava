package Codevita;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MyClassa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antenna ant[] = new Antenna[4];
        for (int i = 0; i < 4; i++) {
            int antennaId = Integer.parseInt(sc.nextLine());
            String antennaName = sc.nextLine();
            String projectLead = sc.nextLine();
            double antennaVSWR = Double.parseDouble(sc.nextLine());

            ant[i] = new Antenna(antennaId, antennaName, projectLead, antennaVSWR);
        }
        String p1 = sc.nextLine();
        double p2 = Double.parseDouble(sc.nextLine());
        int r = searchAntennaByName(ant, p1);
        if (r != 0)
            System.out.println(r);
        else
            System.out.println("There is no Antenna with the given parameter.");
       
        Antenna re[] = sortAntennaByVSWR(ant, p2);
        if (re.length != 0) {
            for (Antenna temp : re) {
                System.out.println(temp.getProjectLead());
            }
        } else
            System.out.println("No Antenna found.");
    }

    private static int searchAntennaByName(Antenna[] ant, String p1) {
        Stream<Antenna> st = Arrays.stream(ant);
        List<Antenna> result = st.filter(x -> x.getAntennaName().equalsIgnoreCase(p1))
                            .collect(Collectors.toList());
        if (result.size() != 0)
            return result.get(0).getAntennaId();
        else
            return 0;
    }

    private static Antenna[] sortAntennaByVSWR(Antenna[] ant, double p2) {
        Stream<Antenna> st = Arrays.stream(ant);
        Antenna result[] = st.filter(x -> x.getAntennaVSWR() < p2)
                        .sorted(Comparator.comparing(Antenna::getAntennaVSWR))
                        .toArray(Antenna[]::new);
        if (result != null)        
            return result;
        else
            return null;
    }
}

class Antenna {
    private int antennaId;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    public Antenna(int antennaId, String antennaName, String projectLead, double antennaVSWR) {
        this.antennaId = antennaId;
        this.antennaName = antennaName;
        this.projectLead = projectLead;
        this.antennaVSWR = antennaVSWR;
    }

    public int getAntennaId() {
        return antennaId;
    }

    public void setAntennaId(int antennaId) {
        this.antennaId = antennaId;
    }

    public String getAntennaName() {
        return antennaName;
    }

    public void setAntennaName(String antennaName) {
        this.antennaName = antennaName;
    }

    public String getProjectLead() {
        return projectLead;
    }

    public void setProjectLead(String projectLead) {
        this.projectLead = projectLead;
    }

    public double getAntennaVSWR() {
        return antennaVSWR;
    }

    public void setAntennaVSWR(double antennaVSWR) {
        this.antennaVSWR = antennaVSWR;
    }
}