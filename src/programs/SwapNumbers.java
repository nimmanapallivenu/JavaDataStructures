package programs;
/*
Swap two numbers
Before Swap
a = 10
b = 20
After Swap
a = 20
b = 10
 */
public class SwapNumbers {

    public static void main(String[] args) {
        System.out.println("Swap two numbers ");
        int a = 10;
        int b = 20;
        System.out.println("Before Swap");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        a = a + b; // 10 +20 = 30
        b = a - b; // 30-20 = 10
        a = a - b; // 30- 10= 20
        System.out.println("After Swap");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

    }
}
