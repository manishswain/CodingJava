package Questions;

import java.util.Scanner;

class AngleBetweenClock {
    public static double angleClock(int h, int m) {
        double hour = (h % 12 + (double) m / 60) * 30;

        double minutes = m * 6;

        double angle = Math.abs(hour - minutes);

        if (angle > 180)
            angle = 360 - angle;

        return angle;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        System.out.println(angleClock(hour, minutes));
        sc.close();
    }
}