package Sigma.PatternAndPyramid;

public class CharacterPyramid {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ch++);
            }
            System.out.println("");
        }
    }
}