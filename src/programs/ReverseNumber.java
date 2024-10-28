package programs;
/*
Reverse Given Number
Origin Number : 15786
Reverse Number : 68751
*/

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println("Reverse Given Number");
        int n = 15786;
        System.out.println("Origin Number : " + n);
        int r = 0;
        while (n > 0) {
            int rem = n % 10;
            r = (r * 10) + rem;
            n = n / 10;
        }
        System.out.println("Reverse Number : " + r);

    }
}
