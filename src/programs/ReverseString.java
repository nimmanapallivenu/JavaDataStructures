package programs;
/*
Reverse Given string
original String: welcome
Reverse String: emoclew
*/
public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Reverse Given string ");
        String s ="welcome";
        System.out.println("original String: "+ s);

        String r = reverseString(s);
        System.out.println("Reverse String: "+ r);
    }

    private static String reverseString(String input){
    StringBuilder builder = new StringBuilder();
    char[] arr =  input.toCharArray();
    for(int i=arr.length-1;i>=0;i--){
        builder.append(arr[i]);
    }
    return builder.toString();
    }
}
