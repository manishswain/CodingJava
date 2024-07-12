package Test;

import java.util.Scanner;

public class Solution2 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Point p1 = new Point(x, y);
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point p2 = new Point(x, y);
        x = sc.nextDouble();
        y = sc.nextDouble();
        Point p3 = new Point(x, y);

        Point result = findDistance(p1, p2, p3);
        System.out.println(result.getX());
        System.out.println(result.getY());

    }

    public static Point findDistance(Point p1, Point p2, Point p3) {

        double res1 = Math.pow(p1.getX(), 2) + Math.pow(p1.getY(), 2);

        double res2 = Math.pow(p2.getX(), 2) + Math.pow(p2.getY(), 2);

        double res3 = Math.pow(p3.getX(), 2) + Math.pow(p3.getY(), 2);

        if (res1 > res2 && res1 > res3)
            return p1;
        else if (res2 > res1 && res2 > res3)
            return p2;
        else
            return p3;
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}