package programs.arrays;

import java.util.Arrays;

/*
Find Largest & Smallest element in given array
Input Array
[1, 4, 6, 7, 3, 9]
Output
Smallest element : 1
Largest element : 9
 */
public class LargestElement {
    public static void main(String[] args) {
        System.out.println("Find Largest & Smallest element in given array");

        int[] arr = {1, 4, 6, 7, 3, 9};
        System.out.println("Input Array");
        System.out.println(Arrays.toString(arr));

        int[] result = findLarSmallElemets(arr);
        System.out.println("Output ");
        System.out.println("Smallest element : " + result[0]);
        System.out.println("Largest element : " + result[1]);
    }

    private static int[] findLarSmallElemets(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
            if (num >= largest) {
                largest = num;
            }
        }

        return new int[]{smallest, largest};

    }
}
