package programs;
/*
---Print Prime Numbers---
        2 3 5 7
*/
public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("---Print Prime Numbers---");
        for (int i = 0; i < 10; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    private static boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
