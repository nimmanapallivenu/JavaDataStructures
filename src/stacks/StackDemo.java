package stacks;

import java.util.Arrays;

// LIFO
public class StackDemo {

    private String[] stackArray;

    private int stackSize;

    private int top = -1;

    StackDemo(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }


    public void push(String input) {
        if (top + 1 < stackSize) {
            top++;
            stackArray[top] = input;
        } else {
            System.out.println(" Sorry Stack already full");
        }
        displayTheStack();
        System.out.println(" Pushed " + input + " was added to the stack");
    }

    public String pop() {
        if (top >= 0) {
            displayTheStack();
            System.out.println("Pop " + stackArray[top] + " Was removed from the stack");
            stackArray[top] = "-1";
            return stackArray[top--];
        } else {
            displayTheStack();
            System.out.println("Sorry But the Stack is empty");
            return "-1";
        }

    }

    public String peep() {
        displayTheStack();
        ;
        System.out.println("PEEP " + stackArray[top] + " Is at Top of the Stack");
        return stackArray[top];
    }


    public void displayTheStack() {
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < stackSize; n++) {
            System.out.format("| %2s " + " ", n);
        }
        System.out.println("|");
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
        for (int n = 0; n < stackSize; n++) {

            if (stackArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s " + " ", stackArray[n]));
        }
        System.out.println("|");
        for (int n = 0; n < 61; n++) System.out.print("-");
        System.out.println();
    }

    public void pushMany(String inputs) {
        String[] tempValues = inputs.split(" ");
        for (int i = 0; i < tempValues.length; i++) {
            push(tempValues[i]);
        }

    }

    public void popAll() {
        for (int i = top; i >= 0; i--) {
            pop();
        }
    }


    public static void main(String[] args) {

        StackDemo stackDemo = new StackDemo(10);
        stackDemo.push("10");
        stackDemo.push("20");
        stackDemo.peep();

        stackDemo.pop();
        stackDemo.displayTheStack();

        stackDemo.pushMany("12 14 18 20");
        stackDemo.popAll();
        stackDemo.displayTheStack();

    }


}
