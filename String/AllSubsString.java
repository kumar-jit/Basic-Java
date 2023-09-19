package String;

import java.util.Scanner;

public class AllSubsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printSubstrings(sc.nextLine());
    }

    public static void printSubstrings(String str) {
        //Your code goes here
        for(int i = 0;i<str.length();i++){
            for(int j = i+1;j<str.length()+1;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
