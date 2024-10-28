package programs;

/*
Remove spaces of given String
With Spaces :welcome to java
Without Spaces: welcometojava

 */
public class RemoveSpaceOfString {

    public static void main(String[] args) {
        System.out.println("Remove spaces of given String");
        String s = "welcome to java ";
        removeSpaces(s);
    }

    static void removeSpaces(String input) {
        System.out.println("With Spaces :" + input);
        String[] arr = input.split("\\s");
        String newStr = String.join("", arr);
        System.out.println("Without Spaces: " + newStr);
    }
}
