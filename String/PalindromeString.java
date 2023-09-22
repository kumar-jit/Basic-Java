package String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(toSmall('Z'));
        System.out.print(isPalindrome(sc.nextLine()));
    }
//    public static boolean isPalindrome(String str) {
//        for(int i = 0; i<str.length()/2;i++){
//            if(str.charAt(i)!=str.charAt(str.length()-1-i))
//                return false;
//        }
//        return true;
//    }

    public static boolean isPalindrome(String str) {
        int s = 0,e = str.length()-1;
        while(s<e){
            char startC = str.charAt(s), endC = str.charAt(e);
            if( isAlpha(startC) && isAlpha(endC) ){
                if(toSmall(startC)!=toSmall(endC))
                    return false;
                s++;e--;
            } else if (isAlpha(startC) && !isAlpha(endC)) {
                e--;
            } else if (!isAlpha(startC) && isAlpha(endC)) {
                s++;
            }
            else {
                s++;e--;
            }
        }
        return true;
    }

    public static boolean isAlpha(char c){
        return (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9'));
    }

    public static boolean isCaps(char c){
        return ('A' <= c && c <= 'Z');
    }

    public static char toSmall(char c){
        if(('a' <= c && c <= 'z'))
            return c;
        else if (('A' <= c && c <= 'Z')) {
            return (char)(c+32);
        }
        return c;

    }
}
