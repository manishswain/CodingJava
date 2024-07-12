package Test;

import java.util.Scanner;

public class Solution1 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point p1 = new Point(x, y);
        x = sc.nextInt();
        y = sc.nextInt();
        Point p2 = new Point(x, y);

        double result = findDistance(p1, p2);
        System.out.printf(String.format("%.3f", result));

    }

    public static double findDistance(Point p1, Point p2) {

        double res1 = Math.pow(Math.abs(p1.getX() - p2.getX()), 2);

        double res2 = Math.pow(Math.abs(p1.getY() - p2.getY()), 2);

        double result = Math.pow(res1 + res2, 0.5);

        return result;

    }
}

// class Point {
//     private int x;
//     private int y;

//     public Point(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }

//     public int getX() {
//         return x;
//     }

//     public void setX(int x) {
//         this.x = x;
//     }

//     public int getY() {
//         return y;
//     }

//     public void setY(int y) {
//         this.y = y;
//     }

// }