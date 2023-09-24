package Test3;

import java.util.Scanner;

public class FaultyKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    public static boolean checkFaulty(String s1,String s2){
        int p1 = 0, p2 = 0;
        while(p1<s1.length() && p2<s2.length()){
            if(s1.charAt(p1)==s2.charAt(p2))
            {
                p1++;p2++;
            }
            else if(p1>0 && s1.charAt(p1-1) == s2.charAt(p2))
                p2++;
            else
                return false;
        }
        while(p2<s2.length()){
            if(s1.charAt(p1-1)!=s2.charAt(p2)){
                return false;
            }
            p2++;
        }
        return p1 == s1.length();
    }
}
