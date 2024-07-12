package Test;

import java.util.Random;

class InstanceOf {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(2);
        A objA = new A(String.valueOf(i), String.valueOf(i + 4));
        B objB = new B();
        Object obj = null;
        if (i == 0) {
            obj = objA;
        } else if (i == 1) {
            obj = objB;
        }
        calcObj(obj);

    }

    public static void calcObj(Object obj) {
        if (obj instanceof A) {
            A testA = (A) obj;
            System.out.println("A executed");
            System.out.println(testA);
        } else if (obj instanceof B) {
            System.out.println("B executed");
        } else {
            System.out.println("False");
        }
    }

}

class A {
    private String a;
    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A [a=" + a + ", b=" + b + "]";
    }

    public A(String a, String b) {
        this.a = a;
        this.b = b;
    }

}

class B {

}