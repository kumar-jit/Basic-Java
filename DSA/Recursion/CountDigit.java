package DSA.Recursion;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(countDigits(sc.nextInt()));
    }
    public static int countDigits(int n){
        // Write your code here.
        if(n==0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }
}
