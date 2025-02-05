package Neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] arr = { "bdddddddddd", "bbbbbbbbbbc" };

        System.out.println(groupAnagramOptimal(arr));
    }

    private static List<List<String>> groupAnagram(String[] arr) {
        if (arr.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();

        int[] count = new int[26];
        for (String s : arr) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");

            for (int i : count) {
                sb.append("#");
                sb.append(i);
            }
            String res = sb.toString();

            if (!map.containsKey(res)) {
                map.put(res, new ArrayList<>());

            }
            map.get(res).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private static List<List<String>> groupAnagramOptimal(String[] arr) {

        // Map to store the sorted string as the key and list of anagrams as the value.
        Map<String, List<String>> map = new HashMap<>();
        // Iterate over each string in the array.
        for (String s : arr) {
            // Convert the string to a character array and sort it.
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            // Create a key from the sorted character array.
            String key = new String(charArray);

            // If the key is not present, add it with an empty list.
            map.putIfAbsent(key, new ArrayList<>());
            // Append the original string to the corresponding list.
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
