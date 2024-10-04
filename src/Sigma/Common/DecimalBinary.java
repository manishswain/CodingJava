package Sigma.Common;

public class DecimalBinary {
    public static void main(String[] args) {
        decimalToBinary(67);
        binaryToDecimal(1011);
    }

    public static void decimalToBinary(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + rem * (int) Math.pow(10, pow);
            pow++;
            decNum /= 2;
        }

        System.out.println("Decimal Number " + myNum + " in Binary is :" + binNum);
    }

    public static void binaryToDecimal(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int rem = binNum % 10;
            decNum = decNum + rem * (int) Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }

        System.out.println("Binary Number " + myNum + " in Decimal is :" + decNum);
    }
}