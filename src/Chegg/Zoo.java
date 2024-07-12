package Chegg;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input User Choice 
        System.out.println("Enter either Dog,Cat or Elephant :");
        String optedAnimal = sc.next();
        //Variable initialization.
        String breed = "";
        String color = "";
        int speed = 0;
        String habitat = "";
        int lifeSpan = 0;

        switch (optedAnimal) {
        case "Dog":
            //Taking input if the user enters dog.
            System.out.println("Enter the breed:");
            breed = sc.next();
            System.out.println("Enter the color:");
            color = sc.next();
            System.out.println("Enter the speed (m/h):");
            speed = sc.nextInt();
            System.out.println("Enter the habitat:");
            habitat = sc.next();
            System.out.println("Enter the lifeSpan:");
            lifeSpan = sc.nextInt();
            System.out.println("------------------------------------");
            Dog dog = new Dog(breed, color, speed, habitat, lifeSpan);
            dog.Food();
            dog.sound();
            System.out.println("To String");
            System.out.println(dog);
            break;

        case "Cat":
            //Taking input if the user enters cat.
            System.out.println("Enter the breed:");
            breed = sc.next();
            System.out.println("Enter the color:");
            color = sc.next();
            System.out.println("Enter the speed (m/h):");
            speed = sc.nextInt();
            System.out.println("Enter the habitat:");
            habitat = sc.next();
            System.out.println("Enter the lifeSpan:");
            lifeSpan = sc.nextInt();
            System.out.println("------------------------------------");
            Cat cat = new Cat(breed, color, speed, habitat, lifeSpan);
            cat.Food();
            cat.sound();
            System.out.println("To String");
            System.out.println(cat);
            break;
        case "Elephant":
            //Taking input if the user enters Elephant.
            System.out.println("Enter the breed:");
            breed = sc.next();
            System.out.println("Enter the color:");
            color = sc.next();
            System.out.println("Enter the speed (m/h):");
            speed = sc.nextInt();
            System.out.println("Enter the habitat:");
            habitat = sc.next();
            System.out.println("Enter the lifeSpan:");
            lifeSpan = sc.nextInt();
            System.out.println("------------------------------------");
            Elephant elephant = new Elephant(breed, color, speed, habitat, lifeSpan);
            System.out.println("To String");
            System.out.println(elephant);
            break;
        default:
            System.out.println("Enter valid choice");
        }
        sc.close();

    }
}

abstract class Animals {
    //Attributes of the Animals class
    String breed;
    String color;
    int speed;
    String habitat;

    //public constructor
    public Animals(String breed, String color, int speed, String habitat) {
        this.breed = breed;
        this.color = color;
        this.speed = speed;
        this.habitat = habitat;
    }
    //toString method overidding
    @Override
    public String toString() {
        return "Animals [breed=" + breed + ", color=" + color + ", habitat=" + habitat + ", speed=" + speed + "]";
    }

}

class Dog extends Animals implements Pets {

    int lifeSpan;

    public Dog(String breed, String color, int speed, String habitat, int lifeSpan) {
        super(breed, color, speed, habitat);
        this.lifeSpan = lifeSpan;
        Double distance = speed * 1.5;
        System.out.println("Distance travelled in a day: " + distance);
    }
    //Overridden Methods of Pet Interface
    @Override
    public void sound() {
        System.out.println("Dog makes bow wow sound");

    }

    @Override
    public void Food() {
        System.out.println("The pet is hungry");
    }

    @Override
    public String toString() {
        return "Animals [breed=" + breed + ", color=" + color + ", habitat=" + habitat + ", speed=" + speed + "]"
                + " Dog [lifeSpan=" + lifeSpan + "]";
    }

}

class Cat extends Animals implements Pets {
    int lifeSpan;
    //public constructor of Cat class.
    public Cat(String breed, String color, int speed, String habitat, int lifeSpan) {
        super(breed, color, speed, habitat);
        this.lifeSpan = lifeSpan;
        Double distance = speed * 1.5;
        System.out.println("Distance travelled in a day: " + distance);
    }

    //Overridden Methods of Pet Interface
    @Override
    public void sound() {
        System.out.println("Cat makes meow meow sound");

    }

    @Override
    public void Food() {
        System.out.println("The pet is hungry");

    }

    @Override
    public String toString() {
        return "Animals [breed=" + breed + ", color=" + color + ", habitat=" + habitat + ", speed=" + speed + "]"
                + " Cat [lifeSpan=" + lifeSpan + "]";
    }

}

class Elephant extends Animals {
    int lifeSpan;
    //public constructor of the Elephants.
    public Elephant(String breed, String color, int speed, String habitat, int lifeSpan) {
        super(breed, color, speed, habitat);
        this.lifeSpan = lifeSpan;
        Double distance = speed * 6.0;
        System.out.println("Distance travelled in a day: " + distance);
    }

    @Override
    public String toString() {
        return "Animals [breed=" + breed + ", color=" + color + ", habitat=" + habitat + ", speed=" + speed + "]"
                + " Elephant [lifeSpan=" + lifeSpan + "]";
    }
}

interface Pets {
    //interface methods .
    void sound();
    void Food();
}
