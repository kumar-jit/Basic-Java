package DSA.Recursion;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(removeConsecutiveDuplicates(sc.next()));
    }

    public static String removeConsecutiveDuplicates(String s) {
        // Write your code here
        String results = "";
        return removeDuplicate(s,0,results);

    }
    public static String removeDuplicate(String s, int i,String resultS){
        if(i>=s.length())
            return resultS;
        if(resultS.isEmpty())
            resultS += s.charAt(i);
        else if(s.charAt(i) != resultS.charAt(resultS.length()-1) )
            resultS += s.charAt(i);
        return removeDuplicate(s,i+1,resultS);
    }

}
