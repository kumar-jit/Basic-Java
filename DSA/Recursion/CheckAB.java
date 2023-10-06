package DSA.Recursion;

import java.util.Scanner;

public class CheckAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkAB(sc.next()));
    }
    public static boolean checkAB(String input) {
        // Write your code here
        return checkString(input,0);
    }
    public static boolean checkString(String s,int i){
        int length = s.length();
        if(i>=length)
            return true;
        if(s.charAt(i) == 'a'){
            // checking rules for "aa"
            if(i+1<length && s.charAt(i+1)=='a')
                return checkString(s,i+1);

            // checking if bb comes after a
            if(i+2<length){
                if(s.startsWith("bb", i+1))
                    return checkString(s,i+3);
                // checking for once b after a
                return !s.startsWith("ba", i + 1);
            }
            // if only single a there its will return true
            return true;
        }
        return false;
    }

}
