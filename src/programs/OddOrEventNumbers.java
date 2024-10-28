package programs;

/*Print Event Numbers
0 2 4 6 8
Print Odd Numbers
1 3 5 7 9
*/
public class OddOrEventNumbers {


    public static void main(String[] args) {
        printEventNumber(10);
        printOddNumber(10);
    }

    //print event even numbers
    private static void printEventNumber(int n){
        System.out.println("Print Event Numbers");
        for(int i=0;i<n;i++){
            if(i %2 == 0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    //print event even numbers
    private static void printOddNumber(int n){
        System.out.println("Print Odd Numbers");
        for(int i=0;i<n;i++){
            if(i %2 != 0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }


}
