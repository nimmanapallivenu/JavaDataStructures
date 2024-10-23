package arrays;

public class ArraysDemo {

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

    public int getValueAtIndex(int index) {
        if (index < arraySize) return theArray[index];
        return 0;
    }

    public boolean containValues(int value) {
        boolean isPresent = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < arraySize - 1; i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value) {
        if (arraySize < 50) {
            theArray[arraySize] = value;
            arraySize++;
        }


    }


    public String linearSearch(int value) {

        boolean isPresent = false;
        String indexWithValues = "";

        System.out.println(" Values was found flowing: ");
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                isPresent = true;
                System.out.print(i + " ");
                indexWithValues += i + " ";
            }
        }
        if (!isPresent) {
            indexWithValues = "None";
            System.out.print(indexWithValues);
        }
        System.out.println();
        return indexWithValues;
    }


    public static void main(String[] args) {
        ArraysDemo arraysDemo = new ArraysDemo();
        arraysDemo.generateRandomeArray();
        arraysDemo.printArray();
        System.out.println(" Index Value 3 " + arraysDemo.getValueAtIndex(3));

        System.out.println(" Contain Value 20 " + arraysDemo.containValues(20));

        arraysDemo.deleteIndex(4);
        arraysDemo.printArray();
        System.out.println(" Insert Value 40 ");
        arraysDemo.insertValue(40);
        arraysDemo.printArray();

        arraysDemo.linearSearch(40);

    }
}
