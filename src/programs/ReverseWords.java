package programs;

/*
Reverse Given words
Origin Word: welcome to java program
Reverse Word: program java to welcome

 */
public class ReverseWords {

    public static void main(String[] args) {
        System.out.println("Reverse Given words ");
        String s = "welcome to java program";
        System.out.println("Origin Word: " + s);
        String r = reverseWord(s);
        System.out.println("Reverse Word: " + r);

    }

    static String reverseWord(String input) {
        String[] arr = input.split("\\s");
        StringBuilder builder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            builder.append(arr[i] + " ");
        }
        return builder.toString().trim();
    }

}
