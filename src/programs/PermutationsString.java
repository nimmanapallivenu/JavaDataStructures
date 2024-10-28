package programs;
/*
Print all permutations of given input
abc
acb
bac
bca
cab
cba
 */
public class PermutationsString {

    public static void main(String[] args) {

        System.out.println(" Print all permutations of given input");

        String input = "abc";
        permute(input, "");
    }

    static void permute(String str, String pre) {
        if (str.length() == 0) {
            System.out.println(pre);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permute(rem, pre + str.charAt(i));

            }
        }
    }
}
