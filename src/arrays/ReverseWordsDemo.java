package arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsDemo {

    public static void main(String[] args) {

        String input = " hello   venu   testing ";
        String[] theArray = input.trim().split(" ");
        List<String> theList = new ArrayList<>();
        for (int i = theArray.length - 1; i >= 0; i--) {
            String v = theArray[i].trim();
            if (v.length() > 0) {
                theList.add(v);
            }
        }
        System.out.println(String.join(" ", theList));
    }

}
