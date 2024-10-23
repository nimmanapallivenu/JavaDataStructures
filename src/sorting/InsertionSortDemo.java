package sorting;

public class InsertionSortDemo {
    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomeArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public void insertSort() {
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int insert = theArray[i];
            while ((j > 0) && (theArray[j - 1] > insert)) {
                theArray[j] = theArray[j - 1];
                j--;
                printHorzArray(i, j);
            }
            theArray[j] = insert;
            printHorzArray(i, j);
            System.out.println(" Array[i] = "+ theArray[i] + " Array[j]" + theArray[j] +" Insert value " + insert);
        }

    }


    private void swapValues(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }


    public static void main(String[] args) {

        InsertionSortDemo insertionSortDemo = new InsertionSortDemo();
        insertionSortDemo.generateRandomeArray();
        insertionSortDemo.insertSort();
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
