package DSA.Recursion;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(convertStringToInt(sc.next()));
    }

    public static int convertStringToInt(String input){
        // Write your code here
        return makeInteger(input,input.length()-1);

    }
    public  static int makeInteger(String str,int end){
        if(end<=0)
            return Character.getNumericValue(str.charAt(0));
        return (makeInteger(str,end-1)*10) + Character.getNumericValue(str.charAt(end));
    }
}
