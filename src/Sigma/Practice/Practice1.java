package Sigma.Practice;

public class Practice1 {

    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        Double d = 99.9954;

        Double res = (f * b) + (i % c) - (d * s);

        System.out.println(res);
    }

}
