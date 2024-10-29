package programs.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Remove duplicates elements from array list
[2, 4, 6, 4, 5, 6]
Removed Duplicates
[2, 4, 5, 6]
 */
public class RemoveDuplicateArrayList {

    public static void main(String[] args) {
        System.out.println("Remove duplicates elements from array list");
        List<Integer> list = new ArrayList<>() {
            {
                add(2);
                add(4);
                add(6);
                add(4);
                add(5);
                add(6);
            }
        };

        System.out.println(list.toString());

        List<Integer> result = removeduplicate(list);
        System.out.println("Removed Duplicates");
        System.out.println(result.toString());

    }

    private static List<Integer> removeduplicate(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.stream().toList();
    }
}
