package programs.arrays;

import java.util.Arrays;

/*
Sum Integer elements in given array
Input Array
[a, 5, 9, i, #, 3]
Sum : 17
 */
public class SumIntegerArray {
    public static void main(String[] args) {
        System.out.println("Sum Integer elements in given array");
        String[] arr = {"a", "5", "9", "i", "#", "3"};
        System.out.println("Input Array");
        System.out.println(Arrays.toString(arr));
        int sum = sumInteger(arr);
        System.out.println("Sum : " + sum);
    }

    private static int sumInteger(String[] arr) {
        int sum = 0;
        for (String s : arr) {
            try {
                int num = Integer.parseInt(s);
                sum += num;
            } catch (NumberFormatException e) {
                //Ignore it
            }
        }

        return sum;
    }
}
