package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book[] = new Book[4];
        for (int i = 0; i < 4; i++) {
            int id = Integer.parseInt(sc.nextLine());

            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = Double.parseDouble(sc.nextLine());

            book[i] = new Book(id, title, author, price);
        }
        Book res[] = sortBooksByPrice(book);
        for (Book temp : res) {
            System.out.println(temp.getId() + " " + temp.getTitle() + " " + temp.getAuthor() + " " + temp.getPrice());
        }

    }

    private static Book[] sortBooksByPrice(Book[] book) {
        Stream<Book> stream = Arrays.stream(book);
        Book res[] = stream.sorted(Comparator.comparing(Book::getPrice)).toArray(Book[]::new);
        return res;
    }
}

class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}