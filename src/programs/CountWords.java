package programs;

/*
Count No of Words in given input
No of words : 4

 */
public class CountWords {
    public static void main(String[] args) {
        System.out.println("Count No of Words in given input");
        String s = "welcome to java program";
        String[] arr = s.split("\\s");
        int counter = 0;
        for (String input : arr) {
            if (input == " ") continue;

            counter += 1;
        }

        System.out.println("No of words : " + counter);
    }
}
