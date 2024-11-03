package Practice;

public class Test {
    public static void main(String... args) {
        System.out.println("Hello World");
        String s3 = new String("Manish");
        String s1 = "Manish";
        String s2 = "Manish";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }
}