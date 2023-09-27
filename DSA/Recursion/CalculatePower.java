package DSA.Recursion;

import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(power(sc.nextInt(),sc.nextInt()));
    }
    public static int power(int x, int n) {
        if( n == 1)
            return x;
        if(n==0)
            return 1;
        return x * power(x, n-1);
    }
}
