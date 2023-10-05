package DSA.Recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPalindrome(sc.next()));
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.
        return checkPalindrome(str,0);
    }

    public static boolean checkPalindrome(String str,int ele){
        int length = str.length();
        if(ele>=length/2)
            return true;
        if(str.charAt(ele) != str.charAt(length-ele-1))
            return false;
        return checkPalindrome(str,ele+1);
    }

}
