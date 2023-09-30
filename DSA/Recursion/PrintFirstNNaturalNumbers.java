package DSA.Recursion;

import java.util.Scanner;

public class PrintFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(sc.nextInt());
    }

    public static void print(int n){
        //Write your code here
        if(n==0)
            return;
        print(n-1);
        System.out.print(n + " ");
    }
}
