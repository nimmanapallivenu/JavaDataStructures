package recursion;

public class RecursionDemo {

    public static void main(String[] args) {
        System.out.println("Without Recursion " +getTriangularNum(6));
        System.out.println("With Recursion "+ getTriNum(6));
    }

    public static int getTriangularNum(int num){
        int sum =0;
        while(num>0){
            sum +=num;
            num--;
        }
        return sum;
    }

    private static int getTriNum(int num) {
        if (num == 1) {
            return num;
        }
        return num + getTriNum(num - 1);
    }

}
