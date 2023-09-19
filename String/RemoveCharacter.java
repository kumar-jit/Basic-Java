package String;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(removeAllOccurrencesOfChar(sc.nextLine(),sc.next().charAt(0)));
    }
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String result = "";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) != ch){
                result += str.charAt(i);
            }
        }
        return result;
    }

//------------------    Using Inbuilt function ----------------------------
//    public static String removeAllOccurrencesOfChar(String str, char ch) {
//        return str.replaceAll(ch+"","");
//    }
}
