package programs;
/*
Swap two String without 3rd variable
Before Swap
Str1 : abc
Str2 xyz
After Swap
Str1 : xyz
Str2 abc

 */
public class SwapStrings {
    public static void main(String[] args) {
        System.out.println("Swap two String without 3rd variable");
        swapStrings("abc","xyz");
    }

    static void swapStrings(String str1,String str2){
        System.out.println("Before Swap");
        System.out.println("Str1 : "+ str1);
        System.out.println("Str2 "+ str2);

        str1= str1+str2;
        str2= str1.substring(0,str2.length());
        str1= str1.substring(str2.length());

        System.out.println("After Swap");
        System.out.println("Str1 : "+ str1);
        System.out.println("Str2 "+ str2);
    }
}
