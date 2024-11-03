package OOPS.Inheritance;

public class Animal {

    private String name;

    public void sayHello() {
        System.out.println("Hello from Animal");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
