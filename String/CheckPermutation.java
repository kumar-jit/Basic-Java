package String;

import java.util.Locale;
import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPermutation(sc.nextLine(),sc.nextLine()));
    }

    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length()!=str2.length())
            return false;
        int[] arr1 = new int[26];
        for(int i = 0;i<str1.length();i++){
            arr1[str1.charAt(i) - 97] += 1;
            arr1[str2.charAt(i) - 97] -= 1;
        }
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]!=0)
                return false;
        }
        return true;
    }
}
