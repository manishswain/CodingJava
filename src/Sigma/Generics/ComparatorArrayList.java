package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);

        Collections.sort(list, new DescComparator());
        System.out.println(list);

        List<String> fruits = Arrays.asList("apple", "banana", "mango");

        fruits.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(fruits);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Manish", 8.5));
        students.add(new Student("Aman", 8.5));
        students.add(new Student("Stiti", 9.5));
        students.add(new Student("Gawar", 5.5));

        // We can use comparator using lamda expression
        // But we can use Java 8 Method Reference and method chaining as well which
        // makes life easier
        Comparator<Student> comp = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comp);
        System.out.println(students);

    }
}

class DescComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}

class Student {

    private String name;

    private double gpa;

    public Student(String name, double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", gpa=").append(gpa);
        sb.append('}');
        return sb.toString();
    }

}
