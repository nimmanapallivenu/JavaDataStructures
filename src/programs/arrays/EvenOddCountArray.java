package programs.arrays;

import java.util.Arrays;

/*
Count even and odd numbers in given array
[2, 3, 4, 5, 6, 7, 9]
Even count : 3
Odd count : 4

 */
public class EvenOddCountArray {
    public static void main(String[] args) {
        System.out.println("Count even and odd numbers in given array");
        int[] arr = {2, 3, 4, 5, 6, 7, 9};
        System.out.println(Arrays.toString(arr));
        int[] result = countEvenOdd(arr);
        System.out.println("Even count : " + result[0]);
        System.out.println("Odd count : " + result[1]);
    }

    private static int[] countEvenOdd(int[] arr) {
        int[] count = new int[2];
        for (int num : arr) {
            if (num % 2 == 0) {
                count[0]++;
            } else {
                count[1]++;
            }
        }

        return count;
    }
}
