package OOPS.Interfaces;

public interface Phone {

    void call();

    void hangUp();

    default void sayHello() {
        System.out.println("Hello");
    }
}
