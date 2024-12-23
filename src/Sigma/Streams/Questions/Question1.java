package Questions;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {

        List<Integer> list = List.of(3, 2, 1, 4, 4);
        Integer res = list.stream().findFirst().get();
        System.out.println("Q1 " + res);
        HashSet<Integer> hash = new HashSet<>();
        List<Integer> res1 = list.stream().filter(x -> {
            return !(hash.add(x));
        }).toList();

        System.out.println(res1);

        System.out.println(list.stream().collect(
                Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()))
                .entrySet().stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()));

        List<String> names = List.of("Manish", "Swain", "Shoaib", "Aman");

        Map<String, Integer> map = names.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);

        names.stream().collect(Collectors.joining("*", "!", "!"));
        
    }
}
