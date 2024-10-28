package programs;
/*
Double each char of the String
Input : hello
Output: hheelllloo

 */
public class DoubleEachCharOfString {

    public static void main(String[] args) {
        System.out.println("Double each char of the String");
        String s ="hello";
        doubleChars(s);
    }
    static void doubleChars(String s){
        System.out.println("Input : "+ s);
        char[] arr= s.toCharArray();
        StringBuilder builder =  new StringBuilder();
        for(char c:arr){
            builder.append(c).append(c);
        }
        System.out.println("Output: "+ builder.toString());
    }


}
