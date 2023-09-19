package String;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(countTotalWords(sc.nextLine()));
    }

    public static int countTotalWords(String str) {
        //Your code goes here\
        if(str.isEmpty())
            return 0;
        int count = 0;
        for(int i =0 ;i<str.length();i++){
            if (str.charAt(i)==' ')
                count ++;
        }
        return count+1;
    }
}
