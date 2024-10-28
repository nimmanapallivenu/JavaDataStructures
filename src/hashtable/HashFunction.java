package hashtable;

import java.util.Arrays;

public class HashFunction {
    String[] theArray;
    int arraySize;
    int itemInArray = 0;

    HashFunction(int size) {
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }


    public static void main(String[] args) {

    }

    
}
