package searching;

import sorting.BobbleSortDemo;

public class BinarySearchDemo {
    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomeArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void bobbleSort() {
        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if(theArray[j]>theArray[j+1]){
                    swapValues(j,j+1);
                    //printHorzArray(i,j);
                }
               // printHorzArray(i,j);
            }
        }

    }

    public void binarySearch(int value){
        int lowIndex = 0;
        int highIndex=arraySize-1;

        while(lowIndex <= highIndex){
            int middleIndex= (highIndex+lowIndex)/2;
            if( theArray[middleIndex] < value) lowIndex=middleIndex+1;
            else if( theArray[middleIndex] > value) highIndex= middleIndex-1;
            else{
                System.out.println(" \n Found a match for " + value +"  at the index "+ middleIndex);
                lowIndex =  highIndex+1;
            }

         printHorzArray(middleIndex,-1);
        }


    }



    private void swapValues(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] =  theArray[indexTwo];
        theArray[indexTwo] =  temp;
    }


    public static void main(String[] args) {
        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        binarySearchDemo.generateRandomeArray();
        binarySearchDemo.bobbleSort();
        binarySearchDemo.binarySearch(13);

    }

    public void printHorzArray(int i, int j) {

        for (int n = 0; n < 51; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < arraySize; n++) {
            System.out.print("| " + n + "  ");
        }
        System.out.println("|");
        for (int n = 0; n < 51; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < arraySize; n++) {
            System.out.print("| " + theArray[n] + " ");
        }
        System.out.println("|");
        for (int n = 0; n < 51; n++) System.out.print("-");
        System.out.println();
        // END OF FIRST PART
        // ADDED FOR BUBBLE SORT
        if (j != -1) {
            // ADD THE +2 TO FIX SPACING
            for (int k = 0; k < ((j * 5) + 2); k++) System.out.print(" ");
            System.out.print(j);
        }
        // THEN ADD THIS CODE
        if (i != -1) {
            // ADD THE -1 TO FIX SPACING
            for (int l = 0; l < (5 * (i - j) - 1); l++) System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }

}