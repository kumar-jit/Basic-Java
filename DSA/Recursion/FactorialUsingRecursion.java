package DSA.Recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fact(sc.nextLong()));
    }

    public static long fact(long n){
        if(n<=0){
            return 1;
        }
        return n + fact(n-1);
    }

    public static long factWithLoop(long n){
        long r = 1;
        for(long i = 1;i<=n;i++){
            r += i;
        }
        return r;
    }
}
