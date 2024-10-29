package arrays;

import java.util.Arrays;

/*
Move all zeros to end of the array
[1, 2, 0, 4, 3, 0, 5, 0]
[1, 2, 4, 3, 5, 0, 0, 0]
 */
public class MoveAllZeros {

    public static void main(String[] args) {
        System.out.println("Move all zeros to end of the array");
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println(Arrays.toString(arr));
        int[] result = moveZeros(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length - 1) {
            arr[count++] = 0;
        }
        return arr;
    }
}
