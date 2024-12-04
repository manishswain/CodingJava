package OOPS.Generics;

public class Test {
    public static void main(String[] args) {
        Box<Number> box = new Box<>();

        box.setValue(354636);
        System.out.println(box.getValue());
    }
}

class Box<T extends Number> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
