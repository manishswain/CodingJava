package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 15, 20);
        System.out.println(numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
        System.out.println(words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        words = Arrays.asList("Java", "StreamAPI", "Functional", "Lambda");
        System.out.println(words.stream().max(Comparator.comparingInt(String::length)).orElse(null));
        // System.out.println(numbers.stream().max(Integer::compareTo).orElse(null));

        Set<Integer> set = new HashSet<>();
        numbers = Arrays.asList(4, 5, 6, 7, 4, 7, 8, 9, 10, 10);
        System.out.println(numbers.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()));

        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "HR", 60000),
                new Employee("Charlie", "IT", 70000),
                new Employee("David", "IT", 90000),
                new Employee("Eve", "Sales", 75000));

        System.out.println(employees.stream().collect(
                Collectors.groupingBy(e -> e.department, Collectors.maxBy(Comparator.comparingDouble(g -> g.salary)))));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.println(names.stream().collect(Collectors.joining(",")));

        List<Product> products = List.of(
                new Product("Laptop", 800),
                new Product("Mouse", 200),
                new Product("Keyboard", 300),
                new Product("Monitor", 700));

        System.out.println(
                products.stream().filter(x -> x.price > 500).sorted(Comparator.comparing(x -> x.price)).toList());

        numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(numbers.stream().filter(x -> x % 2 != 0).map(x -> x * x).reduce(Integer::sum).orElse(-1));

        names = Arrays.asList("java", "streams", "java", "lambda", "Streams");
        System.out.println(names.stream().map(String::toUpperCase).distinct().toList());

        String input = "streamapi";
        char res = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println(res);

        // sum of String find sum

        //

    }

}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - " + price;
    }
}

class Employee {
    String name, department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

public String toString() {
    return name + " - " + salary;
}
