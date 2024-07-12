package Test;

public class X {
    public static void main(String[] args) {
        String s = "47234345345353534G237482374823";
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        System.out.println(s.substring(0, ans));

    }
}
