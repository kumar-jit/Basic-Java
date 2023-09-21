package String;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseEachWord(sc.nextLine()));
    }
    public static String reverseEachWord(String str) {
        String result = "";
        String revWord = "";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==' '){
                result += revWord + " ";
                revWord = "";
            }
            else{
                revWord = str.charAt(i) + revWord;
            }
        }
        return result + revWord;
    }


}
