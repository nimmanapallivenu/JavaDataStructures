package programs.arrays;

import java.util.Arrays;
/*
Sort Array Element without In build functions
Before Sort Elements
[9, 2, 7, 3, 6, 1]
After Sort Elements
[1, 2, 3, 6, 7, 9]
 */
public class SortArrayElements {

    public static void main(String[] args) {
        System.out.println("Sort Array Element without In build functions");
        int[] arr = {9, 2, 7, 3, 6, 1};
        System.out.println("Before Sort Elements");
        System.out.println(Arrays.toString(arr));
        sortArray(arr);
        System.out.println("After Sort Elements");
        System.out.println(Arrays.toString(arr));
    }

    // selection Sorts
    private static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
