package programs.arrays;

import java.util.Arrays;

/*
Find missing number in given array
Input Array
[1, 2, 4, 5, 6, 7]
Missing Number : 3
 */
public class MissingNumberArray {
    public static void main(String[] args) {
        System.out.println("Find missing number in given array");
        int[] arr = {1, 2, 4, 5, 6, 7};
        System.out.println("Input Array");
        System.out.println(Arrays.toString(arr));
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing Number : " + missingNumber);
    }

    // Formula for missing number
    // sum = n* (n+1)/2;
    private static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return totalSum - sum;

    }
}
