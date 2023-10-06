package DSA.Recursion;

import java.util.Scanner;

public class PairStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(addStars(sc.next()));


    }
    public static String addStars(String s) {
        // Write your code here
        return buildString(s,0);
    }

    public static String buildString(String s,int i){
        if(i>=s.length()-1){
            return ""+s.charAt(i);
        }
        return  ((s.charAt(i) == s.charAt(i+1)) ? s.charAt(i)+"*" : s.charAt(i)) + buildString(s,i+1);
    }
}
