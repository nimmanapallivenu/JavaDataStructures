package programs;

public class FactorialNumber {

    public static void main(String[] args) {
        System.out.println("Print Factorial of Given number");
        System.out.println(fact(6));
    }

    private static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
