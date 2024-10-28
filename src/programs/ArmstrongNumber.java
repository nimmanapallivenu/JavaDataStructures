package programs;

import java.util.Scanner;

/*
Given a number x, determine whether the given number is Armstrong’s number or not.

A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if

Input:153
Output: Yes
153 is an Armstrong number.
        1*1*1 + 5*5*5 + 3*3*3 = 153

Input: 120
Output: No
120 is not a Armstrong number.
1*1*1 + 2*2*2 + 0*0*0 = 9

 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int arm = 0, a, b, c, d, no;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        no = scanner.nextInt();
        d = no;
        while (no > 0) {
            a = no % 10;
            no = no / 10;
            arm = arm + a * a * a;
        }
        if (arm == d) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }

}
