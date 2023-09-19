package String;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(removeConsecutiveDuplicates(sc.nextLine()));
    }
    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here
        String result = "";
        for(int i = 0;i<str.length();i++){
            if(result.isEmpty()){
                result += str.charAt(i);
            } else if (result.charAt(result.length()-1)!=str.charAt(i)) {
                result += str.charAt(i);
            }
        }
        return result;
    }

}
