package programs.arrays;

import java.util.Arrays;

/*
Search given element in array
Input array
[1, 3, 5, 7, 5, 10]
output
Element Position: 2
 */
public class SearchElement {

    public static void main(String[] args) {
        System.out.println("Search given element in array");
        int[] arr = {1, 3, 5, 7, 5, 10};
        System.out.println("Input array");
        System.out.println(Arrays.toString(arr));
        int position = searchElement(arr, 5);
        System.out.println("output ");
        System.out.println("Element Position: " + position);
    }

    private static int searchElement(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
