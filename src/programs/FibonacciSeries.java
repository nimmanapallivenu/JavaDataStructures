package programs;
/*
Print Fibonacci Series
0 1 1 2 3 5 8 13 21 34
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println("Print Fibonacci Series ");
        printFibonacciSeries(10);
    }

    private static void printFibonacciSeries(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}
