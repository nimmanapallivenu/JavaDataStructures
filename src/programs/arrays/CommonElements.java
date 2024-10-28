package programs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
f
Input Array 1 : [1, 2, 3, 4, 5]
Input Array 2 : [4, 5, 6, 7]
Common Elements are :[4, 5]

 */
public class CommonElements {

    public static void main(String[] args) {
        System.out.println("Find the common elements between arrays");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7};
        System.out.println("Input Array 1 : " + Arrays.toString(arr1));
        System.out.println("Input Array 2 : " + Arrays.toString(arr2));
        Set<Integer> common = findCommonElements(arr1, arr2);
        System.out.println("Common Elements are :" + common.toString());
    }

    static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> common = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        for (int i : arr2) {
            if (set1.contains(i))
                common.add(i);
        }

        return common;
    }
}
