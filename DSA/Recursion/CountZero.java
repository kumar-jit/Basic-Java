package DSA.Recursion;

import java.util.Scanner;

public class CountZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countZerosRec(sc.nextInt()));
    }

    public static int countZerosRec(int input){
        // Write your code here
        if(input<10){
            return (input==0) ? 1 : 0;
        }
        return ((input%10 == 0)? 1  : 0) + countZerosRec(input / 10);
    }

}
