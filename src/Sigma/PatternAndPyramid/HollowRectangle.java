public class HollowRectangle {
    public static void main(String[] args) {
        int length = 20;
        int breadth = 10;

        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || j == 1 || i == breadth || j == length) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}