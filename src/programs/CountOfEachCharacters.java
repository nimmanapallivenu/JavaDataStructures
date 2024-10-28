package programs;

import java.util.HashMap;
import java.util.Map;

/*
Find the Count of Each characters in given string
P : 1
a : 4
r : 3
e : 1
v : 1
g : 2
i : 1
J : 1
L : 1
m : 2
n : 2
o : 1
 */
public class CountOfEachCharacters {

    public static void main(String[] args) {
        System.out.println("Find the Count of Each characters in given string");

        characterCount("Learn Java Programming");
    }

    static void characterCount(String input) {
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
            System.out.println(c + " : " + counter.get(c));
        }

    }

}
