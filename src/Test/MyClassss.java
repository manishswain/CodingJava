package Test;

import java.util.*;

class EduProgram {
    private String eduProgramName;
    private String sponsor;
    private int noOfPeopleAttended;
    private boolean stillAvailable;
    private boolean withinCountry;

    public String getEduProgramName() {
        return eduProgramName;
    }

    public void setEduProgramName(String eduProgramName) {
        this.eduProgramName = eduProgramName;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public int getNoOfPeopleAttended() {
        return noOfPeopleAttended;
    }

    public void setNoOfPeopleAttended(int noOfPeopleAttended) {
        this.noOfPeopleAttended = noOfPeopleAttended;
    }

    public boolean isStillAvailable() {
        return stillAvailable;
    }

    public void setStillAvailable(boolean stillAvailable) {
        this.stillAvailable = stillAvailable;
    }

    public boolean isWithinCountry() {
        return withinCountry;
    }

    public void setWithinCountry(boolean withinCountry) {
        this.withinCountry = withinCountry;
    }

    public EduProgram(String eduProgramName, String sponsor, int noOfPeopleAttended, boolean stillAvailable,
            boolean withinCountry) {
        super();
        this.eduProgramName = eduProgramName;
        this.sponsor = sponsor;
        this.noOfPeopleAttended = noOfPeopleAttended;
        this.stillAvailable = stillAvailable;
        this.withinCountry = withinCountry;
    }
}

public class MyClassss {
    public static String findEduProgramClassification(EduProgram[] arr) {
        String classification = null;
        int noOfPeople = 0;
        boolean flag = false;
        for (EduProgram obj : arr) {
            if (obj.isStillAvailable() && obj.isWithinCountry()) {
                noOfPeople = obj.getNoOfPeopleAttended();
                flag = true;
            }
        }
        if (flag) {
            if (noOfPeople >= 1000) {
                classification = "EverGreen";
            } else if (noOfPeople >= 500 && noOfPeople < 1000) {
                classification = "Golden";
            } else {
                classification = "Emerging Star";
            }
        }
        return classification;
    }

    public static EduProgram[] findEduProgramBySponsor(EduProgram[] arr, String givenname) {
        ArrayList<EduProgram> list = new ArrayList<EduProgram>();
        for (EduProgram obj : arr) {
            if (obj.getSponsor().equalsIgnoreCase(givenname)) {
                list.add(obj);
            }
        }
        Collections.sort(list, new Comparator<EduProgram>() {

            @Override
            public int compare(EduProgram o1, EduProgram o2) {
                return o1.getNoOfPeopleAttended() - o2.getNoOfPeopleAttended();
            }
        });

        EduProgram[] retarr = new EduProgram[list.size()];

        for (int i = 0; i < list.size(); i++) {
            retarr[i] = list.get(i);
        }

        if (list.size() == 0) {
            return null;
        } else {
            return retarr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EduProgram[] inparr = new EduProgram[4];
        for (int i = 0; i < 4; i++) {
            String eduProgramName = sc.next();
            String sponsor = sc.next();
            int noOfPeopleAttended = sc.nextInt();
            boolean stillAvailable = sc.nextBoolean();
            boolean withinCountry = sc.nextBoolean();
            inparr[i] = new EduProgram(eduProgramName, sponsor, noOfPeopleAttended, stillAvailable, withinCountry);
        }
        String inpSponsor = sc.next();
        String classification = findEduProgramClassification(inparr);
        if (classification != null) {
            System.out.println(classification);
        } else {
            System.out.println("EduPrograms are not available now");
        }
        EduProgram[] received = findEduProgramBySponsor(inparr, inpSponsor);
        if (received == null) {
            System.out.println("No EduProgram is available for the given sponsor");
        } else {
            for (EduProgram obj : received) {
                System.out.println(obj.getEduProgramName());
                System.out.println(obj.getNoOfPeopleAttended());
            }
        }
    }
}
