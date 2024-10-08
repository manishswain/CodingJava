public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        int n = 8;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i + 1) {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
}
