package Questions;

import java.util.Arrays;
import java.util.List;

public class StreamApiQuestions50 {

    public static void main(String[] args) {
        getQuestions().forEach(question -> {
            System.out.println("Q" + question.number + ". " + question.text);
            System.out.println();
        });
    }

    private static List<Question> getQuestions() {
        return Arrays.asList(
                new Question(1,
                        "Given a List<Integer>, return the second highest distinct number using Stream API."),
                new Question(2,
                        "Given a List<String>, find all strings that start with 'A' and have length greater than 3."),
                new Question(3,
                        "Given a List<Integer>, separate even and odd numbers using Collectors.partitioningBy()."),
                new Question(4,
                        "Given a List<String>, count the frequency of each word using groupingBy() and counting()."),
                new Question(5,
                        "Given a List<Employee>, group employees by department and return Map<String, List<Employee>>."),
                new Question(6,
                        "Given a List<Employee>, find the highest paid employee in each department."),
                new Question(7,
                        "Given a List<Employee>, calculate the average salary of employees in each department."),
                new Question(8,
                        "Given a List<Employee>, get names of employees sorted by salary in descending order."),
                new Question(9,
                        "Given a List<Integer>, find duplicate elements without using any loop."),
                new Question(10,
                        "Given a List<Integer>, remove duplicates while preserving original insertion order."),
                new Question(11,
                        "Given a sentence, find the first non-repeated character using streams."),
                new Question(12,
                        "Given a sentence, find the first repeated character using streams."),
                new Question(13,
                        "Given a List<String>, join all names with comma as delimiter, prefix '[', and suffix ']'."),
                new Question(14,
                        "Given a List<Integer>, calculate sum, average, min, and max using summarizingInt()."),
                new Question(15,
                        "Given a List<List<Integer>>, flatten it into a single List<Integer> using flatMap()."),
                new Question(16,
                        "Given a List<String> containing comma-separated values, split and collect all unique values."),
                new Question(17,
                        "Given a List<Employee>, find top 3 highest paid employees."),
                new Question(18,
                        "Given a List<Employee>, skip the first 2 highest paid employees and return the next 3."),
                new Question(19,
                        "Given a List<String>, sort words first by length and then alphabetically."),
                new Question(20,
                        "Given a List<Integer>, check whether all numbers are positive using allMatch()."),
                new Question(21,
                        "Given a List<Integer>, check whether at least one number is divisible by both 3 and 5."),
                new Question(22,
                        "Given a List<Integer>, check whether no number is negative using noneMatch()."),
                new Question(23,
                        "Given a List<Employee>, find any employee from the 'IT' department using findAny()."),
                new Question(24,
                        "Given a List<Employee>, find the first employee whose salary is greater than 50000."),
                new Question(25,
                        "Given a List<String>, convert every string to uppercase and collect into a Set."),
                new Question(26,
                        "Given a List<Employee>, create a Map<Integer, String> of employee id to employee name."),
                new Question(27,
                        "Given a List<Employee>, create a Map<String, Employee> using employee email as key and handle duplicate emails."),
                new Question(28,
                        "Given a List<Employee>, group employees by department and collect only their names."),
                new Question(29,
                        "Given a List<Employee>, count number of employees in each department."),
                new Question(30,
                        "Given a List<Employee>, find departments having more than 5 employees."),
                new Question(31,
                        "Given a List<Integer>, generate squares of all even numbers and collect them into a List."),
                new Question(32,
                        "Given a List<String>, remove null and blank strings using streams."),
                new Question(33,
                        "Given a List<Integer>, use reduce() to calculate product of all numbers."),
                new Question(34,
                        "Given a List<String>, use reduce() to find the longest word."),
                new Question(35,
                        "Given a List<Transaction>, group transactions by type and calculate total amount for each type."),
                new Question(36,
                        "Given a List<Order>, find customers who placed more than 3 orders."),
                new Question(37,
                        "Given a List<Order>, calculate total order amount per customer."),
                new Question(38,
                        "Given a List<Employee>, partition employees into salary greater than 60000 and salary less than or equal to 60000."),
                new Question(39,
                        "Given a List<Employee>, find the youngest employee in each department."),
                new Question(40,
                        "Given a List<Employee>, sort employees by department name and then by salary descending."),
                new Question(41,
                        "Given a List<String>, build a Map<Character, List<String>> grouping words by their first character."),
                new Question(42,
                        "Given a List<String>, find duplicate words ignoring case sensitivity."),
                new Question(43,
                        "Given a List<Integer>, get the 3rd, 4th, and 5th smallest distinct numbers using skip() and limit()."),
                new Question(44,
                        "Given two List<Integer>, find common elements using streams."),
                new Question(45,
                        "Given two List<Integer>, merge them, remove duplicates, and sort in ascending order."),
                new Question(46,
                        "Given a List<Employee>, use Collectors.toMap() to map department to highest salary in that department."),
                new Question(47,
                        "Given a List<String>, count occurrences of each character across all strings."),
                new Question(48,
                        "Given a List<Employee>, find employees whose names contain duplicate characters."),
                new Question(49,
                        "Given a List<Integer>, create a comma-separated string of only odd numbers."),
                new Question(50,
                        "Given a List<Employee>, group employees by department, then by gender, using nested groupingBy()."));
    }

    private static class Question {
        private final int number;
        private final String text;

        private Question(int number, String text) {
            this.number = number;
            this.text = text;
        }
    }
}
