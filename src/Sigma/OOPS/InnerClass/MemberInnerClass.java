package OOPS.InnerClass;

public class MemberInnerClass {

    public static void main(String[] args) {
        Car car = new Car("TATA", "Safari");
        Car.Engine engine = car.new Engine();

        engine.engineStart();
        engine.engineStart();
        engine.engineStart();
        engine.engineStart();
        engine.engineStart();
        engine.engineStop();
        engine.engineStop();
        engine.engineStop();
        engine.engineStop();

        Integer man = null;
        int n = 5;
        Integer man1 = n;

        Throwable th = new Throwable();
    }
}

class Car {
    private String brand;

    private String model;

    private boolean isPoweredOn;

    class Engine {

        void engineStart() {
            if (isPoweredOn) {
                System.out.println("Already On");
            } else {
                isPoweredOn = true;
                System.out.println("Engine Started");
            }
        }

        void engineStop() {
            if (isPoweredOn) {
                isPoweredOn = false;
                System.out.println("Engine Stopped");
            } else {

                System.out.println("Engine Already Stopped");
            }
        }
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isPoweredOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isPoweredOn() {
        return isPoweredOn;
    }

    public void setPoweredOn(boolean isPoweredOn) {
        this.isPoweredOn = isPoweredOn;
    }
}