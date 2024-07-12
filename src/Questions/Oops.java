package Questions;

public class Oops {
    public static void main(String[] args) {
        vamsi v = new vamsi();
        System.out.println("for vamsi class");
        v.Add(2, 3); // addition of two integers
        v.Add(2.3f, 2.7f); // addition of two floats
        manoj m = new manoj();
        System.out.println("for manoj which is inherited from vamsi class");
        m.Add(2, 3); // multiplication of two integers
        pavan p = new pavan();// constructor created, object Instantiation
        p.run();
        p.walk();
    }
}

class vamsi// Encapsulation
{
    public void Add(int a, int b) {
        int c = a + b;
        System.out.println("ths int sum " + c);
    }

    public void Add(float a, float b)// Overload
    {
        float c = a + b;
        System.out.println("ths float sum " + c);
    }
}

class manoj extends vamsi {
    public void Add(int a, int b)// Override
    {
        int c = a * b;
        System.out.println("the in mull override " + c);
    }
}

interface aaa// Abstraction
{
    void run();

    void walk();
}

class pavan implements aaa {
    public void run() {
        System.out.println("the system is running ");
    }

    public void walk() {
        System.out.println("the system is walking ");
    }
}