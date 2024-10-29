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
        //System.out.println(str1 + "  and  " + str2 + " are Anagrams : " + isAnagram(str1, str2));
        System.out.println(str1 + "  and  " + str2 + " are Anagrams : " + isAnagramStrings(str1, str2));

    }

    static boolean isAnagramStrings(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) return false;
        int[] charCount = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            charCount[c1 - 'a']++;
            charCount[c2 - 'a']--;
        }

        for (int ch : charCount) {
            if (ch != 0) {
                return false;
            }
        }

        return true;
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
