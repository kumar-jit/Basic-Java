package String;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseEachWord(sc.nextLine()));
    }
    public static String reverseEachWord(String str) {
        String result = "";
        String subStr = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)!= ' '){
                subStr = str.charAt(i) + subStr;
            }
            else{
                result += (result.isEmpty())? subStr : (" " + subStr);
                subStr = "";
            }
        }
        return ( (result.isEmpty())? subStr : ( result + " " + subStr) );
    }


}
