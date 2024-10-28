package programs;

import java.util.HashMap;
import java.util.Map;

/*
Find the duplicate characters in given string
input : Learn Java Programming
a : 4
r : 3
g : 2
m : 2
n : 2

 */
public class DuplicateCharacters {

    public static void main(String[] args) {
        System.out.println("Find the duplicate characters in given string");

        duplicateCharacterCount("Learn Java Programming");
    }

    static void duplicateCharacterCount(String input) {
        char arr[] = input.toCharArray();
        Map<Character, Integer> counter = new HashMap<>();

        for (Character c : arr) {
            if (c == ' ') continue;
            if (counter.containsKey(c)) {
                counter.put(c, counter.get(c) + 1);
            } else {
                counter.put(c, 1);
            }
        }

        for (Character c : counter.keySet()) {
            if (counter.get(c) > 1) {
                System.out.println(c + " : " + counter.get(c));
            }
        }

    }

}
