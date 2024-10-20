package hashing;

import java.util.HashMap;

public class isAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));

    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> counter = new HashMap<>();

        for (char c: s.toCharArray()) {
            counter.merge(c, 1, (a, b) -> a + b);
        }

        for (char c : t.toCharArray()) {
            counter.merge(c, -1, Integer::sum);
            if (counter.get(c) == 0) {
                counter.remove(c);
            }
        }

        return counter.isEmpty();

    }
}
