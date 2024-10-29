package programs;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        String input = "III";
        int sum = 0;
        for (char c : input.toCharArray()) {
            sum += map.get(c);
        }
        System.out.println("Output: " + sum);
    }
}
