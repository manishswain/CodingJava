import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8StreamsDemoInterview {

    public static void main(String[] args) {

        System.out.println("========== 1. Basic Filtering & Collecting ==========");
        // Task: Separate Odd and Even Numbers
        // Concept: partitioningBy splits a stream into two parts (true/false) based on
        // a predicate.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> oddEvenMap = numbers.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println("Even Numbers: " + oddEvenMap.get(true));
        System.out.println("Odd Numbers: " + oddEvenMap.get(false));

        // Task: Remove Duplicate Elements
        // Concept: distinct() uses .equals() to remove duplicates.
        List<String> names = Arrays.asList("Java", "Python", "Java", "C++", "Python");
        List<String> uniqueNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique Names: " + uniqueNames);

        System.out.println("\n========== 2. Frequency & Grouping ==========");
        // Task: Frequency of Each Character in String
        // Concept: chars() returns an IntStream of ASCII values. We map them to
        // characters
        // and then group by the character itself (Identity), counting occurrences.
        String inputString = "banana";
        Map<Character, Long> charFrequency = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Char Frequency in 'banana': " + charFrequency);

        // Task: Frequency of Each Element in an Array
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> itemFrequency = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Item Frequency: " + itemFrequency);

        System.out.println("\n========== 3. Sorting & Comparison ==========");
        // Task: Sort List in Reverse Order
        // Concept: Comparator.reverseOrder() flips the natural sorting order.
        List<Integer> sortedReverse = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Reverse Sorted: " + sortedReverse);

        // Task: Sort Strings by Length
        // Concept: Comparator.comparing() lets you pick the attribute to sort by.
        List<String> words = Arrays.asList("Apple", "Bat", "Cat", "Elephant", "Dog");
        List<String> sortedByLength = words.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println("Sorted by Length: " + sortedByLength);

        // Task: Second Largest Number
        // Concept: Sort in reverse -> Skip the first element (the largest) -> Take the
        // next one.
        Integer secondLargest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Second Largest Number: " + secondLargest);

        System.out.println("\n========== 4. Array Manipulation ==========");
        // Task: Merge Two Unsorted Arrays into Single Sorted Array without Duplicates
        // Concept: IntStream.concat joins streams. distinct() removes dupes. sorted()
        // sorts.
        int[] arr1 = { 4, 1, 9 };
        int[] arr2 = { 9, 2, 5 };
        int[] mergedSortedUnique = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .distinct()
                .sorted()
                .toArray();
        System.out.println("Merged, Unique, Sorted Array: " + Arrays.toString(mergedSortedUnique));

        // Task: Reverse an Integer Array (Mathematical Approach)
        // Concept: Iterate from 0 to length-1, and map index i to the value at (length
        // - 1 - i).
        // Note: This creates a new array rather than modifying in-place.
        int[] originalArray = { 10, 20, 30, 40 };
        int[] reversedArray = IntStream.range(0, originalArray.length)
                .map(i -> originalArray[originalArray.length - 1 - i])
                .toArray();
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

        System.out.println("\n========== 5. Advanced String Operations ==========");
        // Task: Join Strings with Delimiter, Prefix, and Suffix
        // Concept: Collectors.joining handles all the string concatenation logic
        // efficiently.
        String joinedString = names.stream()
                .distinct()
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println("Joined String: " + joinedString);

        // Task: Check if two strings are Anagrams
        // Concept: Clean string -> split -> sort -> join. If sorted versions match,
        // they are anagrams.
        String s1 = "RaceraC";
        String s2 = "rCaRace";

        String s1Sorted = Stream.of(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        String s2Sorted = Stream.of(s2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        boolean isAnagram = s1Sorted.equals(s2Sorted);
        System.out.println("Are '" + s1 + "' and '" + s2 + "' anagrams? " + isAnagram);

        // Task: Reverse Each Word of a String
        // Concept: Split by space -> Map each word to StringBuilder reverse -> Join
        // back.
        String sentence = "Hello Java World";
        String reversedWords = Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed Words: " + reversedWords);

        System.out.println("\n========== 6. Logic & Calculations ==========");
        // Task: Sum of All Digits of a Number
        // Concept: Convert number to String -> Split -> Parse each digit to Int -> Sum.
        int number = 12345;
        int sumOfDigits = Stream.of(String.valueOf(number).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("Sum of digits of " + number + ": " + sumOfDigits);

        // Task: Fibonacci Series
        // Concept: Stream.iterate generates an infinite stream based on a seed and a
        // function.
        // We use an array {a, b} to keep track of the current pair.
        System.out.print("Fibonacci Series (first 10): ");
        Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] })
                .limit(10)
                .map(t -> t[0]) // Extract the first number of the pair
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        // Task: Age Calculation
        // Concept: ChronoUnit.YEARS calculates the difference between two LocalDate
        // objects.
        LocalDate birthDay = LocalDate.of(1995, 5, 20);
        LocalDate today = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthDay, today);
        System.out.println("Age for DOB 1995-05-20: " + age + " years");
    }
}
