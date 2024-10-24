package recursion;

public class FactorialDemo {

    public static void main(String[] args) {
        System.out.println("Factorial "+ fact(6));

    }

    public static int fact(int num){
        System.out.println("Method :" + num);
        if( num==1){
            System.out.println("Returned 1");
            return 1;

        }else{
            int result = num* fact(num-1);
            System.out.print("Returned "+ result);
            System.out.println(" : "+ num +" * fact("+num+" -1)");
            return result;
        }
    }
}
