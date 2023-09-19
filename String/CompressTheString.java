package String;

import java.util.Scanner;

public class CompressTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getCompressedString(sc.nextLine()));
    }
    public static String getCompressedString(String str) {
        //Your code goes here
        String result = "";
        int count = 1;
        for(int i = 0;i<str.length();i++){
            if(result.isEmpty()){
                result += str.charAt(i);
            } else if (result.charAt(result.length()-1)!=str.charAt(i)) {
                result += ((count!=1)?(count+"") : "" )+ str.charAt(i);
                count = 1;
            }
            else {
                ++count;
            }
        }
        return (result + ((count!=1)?(count+"") : "" ));
    }
}
