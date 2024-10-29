package programs.arrays;

import java.util.ArrayList;
import java.util.List;

/*
Find the last element in list
First element : Apple
Last element : grapes
 */
public class LastElementList {

    public static void main(String[] args) {
        System.out.println("Find the last element in list");
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("banana");
        list.add("Cherry");
        list.add("dates");
        list.add("grapes");

        if (!list.isEmpty()) {
            String firstEle = list.get(0);
            String lastEle = list.get(list.size() - 1);
            System.out.println("First element : " + firstEle);
            System.out.println("Last element : " + lastEle);
        } else {
            System.out.println("List is empty!...");
        }


    }
}
