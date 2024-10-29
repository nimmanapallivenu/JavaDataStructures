package programs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
[5, 3, 9, 1, 3, 5]
Removed Duplicate elements
[1, 3, 5, 9]
 */
public class RemoveDuplicateElements {

    public static void main(String[] args) {
        System.out.println("Remove duplicate elements in given array");
        int[] arr = {5, 3, 9, 1, 3, 5};
        System.out.println(Arrays.toString(arr));
        int[] result = removeDuplicates(arr);
        System.out.println("Removed Duplicate elements");
        System.out.println(Arrays.toString(result));
    }

    static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int s : set) {
            result[i++] = s;
        }
        return result;
    }

}
