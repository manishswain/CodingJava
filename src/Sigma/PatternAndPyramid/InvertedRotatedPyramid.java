public class InvertedRotatedPyramid {
    public static void main(String[] args) {
        int length = 4;
        int breadth = 4;

        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= length; j++) {
                if (length - j >= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
