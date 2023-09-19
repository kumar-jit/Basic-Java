package String;

import java.util.Arrays;
import java.util.Scanner;

public class HighestOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(highestOccuringChar(sc.nextLine()));
    }
    public static char highestOccuringChar(String str) {
        //Your code goes here
        if(str.isEmpty())
            return ' ';
        int arr[] = new int[26];
        int max = 0, position = 0;
        for(int i = 0;i<str.length();i++)
            arr[str.charAt(i)-97] += 1;
        for(int i = 0;i<26;i++){
            if(arr[i]>max){
                max = arr[i];
                position = i;
            }
        }
        return (char) (position+97);
    }
}
