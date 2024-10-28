package programs;

/*
Find two String are Anagrams are not ?
listen  and  silent are Anagrams : true

 */
public class AnagramsString {

    public static void main(String[] args) {
        System.out.println("Find two String are Anagrams are not ?");
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(str1 + "  and  " + str2 + " are Anagrams : " + isAnagram(str1, str2));

    }

    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] charCount = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }


        return true;
    }
}
