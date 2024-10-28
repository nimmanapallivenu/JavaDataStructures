package programs;

/*
Find the Palindrome of given input String
Input String : madam
madam is Palindrome


 */
public class PalindromeString {

    public static void main(String[] args) {
        System.out.println("Find the Palindrome of given input String");
        String s = "madam";
        System.out.println("Input String : " + s);
        boolean isPalindrome = isPalindrome(s);

        if (isPalindrome) {
            System.out.println(s + " is Palindrome ");

        } else {
            System.out.println(s + " is not Palindrome ");
        }

    }

    static boolean isPalindrome(String input) {

        int n = input.length();
        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - 1 - i)) {
                return false;
            }

        }


        return true;
    }
}
