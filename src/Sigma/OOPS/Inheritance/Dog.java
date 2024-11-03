package OOPS.Inheritance;

public class Dog extends Animal {
    @Override
    public void sayHello() {
        System.out.println("Hello from Dog");
    }

    public void bark() {
        System.out.println("Barking");
    }
}
