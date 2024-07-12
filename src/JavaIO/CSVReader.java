package JavaIO;

import java.io.File;
import java.util.Scanner;

public class CSVReader {
    public static void main(String[] args) {

        try {
            File csvFile = new File("Students.csv");
            Scanner sc = new Scanner(csvFile);

            int count = 0;
            while (sc.hasNextLine()) {
                String contents[] = sc.nextLine().split(",");

                count++;

                System.out.println("Student Number: " + count);
                System.out.println("Name: " + contents[0]);
                System.out.println("Roll: " + contents[1]);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
