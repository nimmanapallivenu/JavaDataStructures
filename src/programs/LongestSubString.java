package programs;

import java.util.HashSet;

/*
Find the Longest sub string from given input
Input welcometojava
Max Sub String  len :7

 */
public class LongestSubString {

    public static void main(String[] args) {
        System.out.println("Find the Longest sub string from given input");
        String s = "welcometojava";
        System.out.println("Input " + s);
        findLongestSubString(s);
    }

    static void findLongestSubString(String input) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        int end = 0;

        while (end < input.length()) {
            char c = input.charAt(end);
            if (!set.contains(c)) {
                set.add(c);
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                set.remove(input.charAt(start));
                start++;
            }
        }

        System.out.println("Max Sub String  len :" + maxLength);
    }
}
