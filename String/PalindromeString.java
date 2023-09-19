package String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(isPalindrome(sc.nextLine()));
    }
    public static boolean isPalindrome(String str) {
        //Your code goes here
        String reverse = "";

        for(int i = 0; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }
}
