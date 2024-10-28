package programs;
/*
Print Even index characters of given string
w l o e t   a a p o r m

w l o e t   a a p o r m

 */
public class EvenIndexCharacters {

    public static void main(String[] args) {
        System.out.println("Print Even index characters of given string");
        String s = "welcome to java program";
        printEvenIndexChars(s);

    }

    static void printEvenIndexChars(String input) {
        char[] arr= input.toCharArray();
        for(int i=0;i<arr.length;i=i+2){
           // if(i %2 == 0){
                System.out.print(arr[i] + " ");
           // }
        }
    }
}

