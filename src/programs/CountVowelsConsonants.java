package programs;
/*
Print Vowels & Consonants counts of given string
Vowels : 3
Consonants : 7
 */
public class CountVowelsConsonants {

    public static void main(String[] args) {

        System.out.println("Print Vowels & Consonants counts of given string ");

        printVowelsConsonantsCount("Hello world");
    }

    static void printVowelsConsonantsCount(String input){
    int vowels=0, consonants =0;
    input = input.toLowerCase();
    char[] arr= input.toCharArray();
    for(char c: arr){
        if(c>= 'a' && c<='z'){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u' ){
                vowels++;
            }else{
                consonants++;
            }
        }
    }

        System.out.println("Vowels : "+ vowels);
        System.out.println("Consonants : "+ consonants);

    }
}
