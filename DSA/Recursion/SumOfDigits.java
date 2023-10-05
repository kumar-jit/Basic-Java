package DSA.Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfDigits(sc.nextInt()));
    }
    public static int sumOfDigits(int input){
        // Write your code here
        if(input<10)
            return input;
        return (input % 10) + sumOfDigits(input/10);
    }

}
