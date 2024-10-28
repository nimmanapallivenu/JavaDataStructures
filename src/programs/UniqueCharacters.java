package programs;
/*
Print all unique characters of give string
w e l c o m t j a v p r g
 */
public class UniqueCharacters {

    public static void main(String[] args) {
        System.out.println("Print all unique characters of give string");
        String s = "welcome to java program";
        printUniqueChars(s);
    }

    private static void printUniqueChars(String str) {
        // Assume ASCII characters (0-127), use boolean array to track
        // character occurrences
        boolean[] unique = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!unique[ch] && ch != ' ') {
                unique[ch] = true;
                System.out.print(ch + " ");
            }
        }
    }
}
