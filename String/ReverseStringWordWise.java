package String;

import java.util.Scanner;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseWordWise(sc.nextLine()));
    }

    public static String reverseWordWise(String input) {
        // Write your code here

        String[] s = input.split(" ");
        String result = "";
        for(int i = s.length-1;i>=0;i--){
            result += (i == s.length-1) ? s[i] : (" " + s[i]);
        }
        return result;
    }
}
