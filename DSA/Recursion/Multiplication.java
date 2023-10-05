package DSA.Recursion;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(multiplyTwoIntegers(sc.nextInt(), sc.nextInt()));
    }
    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        if(n<=0)
            return 0;
        return m + multiplyTwoIntegers(m,n-1);

    }
}
