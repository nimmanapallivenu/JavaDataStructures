package programs;

/*
Find given number is Palindrome or not
Palindrome Number
 */
public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println("Find given number is Palindrome or not");

        int num = 121;

        int rev = reverseNumber(num);
        if (num == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }


    }

    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        return rev;
    }

}
