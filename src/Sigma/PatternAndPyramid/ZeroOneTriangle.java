public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }
}
/* My Approach */
/*
 * int n = 10;
 * boolean flag;
 * for (int i = 1; i <= n; i++) {
 * if (i % 2 != 0) {
 * flag = true;
 * } else {
 * flag = false;
 * }
 * for (int j = 1; j <= i; j++) {
 * if (flag) {
 * System.out.print("1");
 * flag = false;
 * } else {
 * System.out.print("0");
 * flag = true;
 * }
 * }
 * System.out.println("");
 * }
 */
