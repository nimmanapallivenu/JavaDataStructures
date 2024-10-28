package programs;
/*
Print Sum of Digits  util sum <=9: 123
1+2+3
Sum is: 6

Print Sum of Digits  util sum <=9: 1990
1+9+9+0 = 19 ; 1+9=10 ; 1+0=1
Sum is: 1

*/

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 123;
        System.out.println("Print Sum of Digits  util sum <=9: "+ num);

        int sum =0;
        while(num>0 || sum >9){
            if(num == 0){
                num =sum;
                sum = 0;
            }
            int r = num%10;
            sum +=r;
            num = num/10;
        }
        System.out.println("Sum is: " + sum);


    }
}
