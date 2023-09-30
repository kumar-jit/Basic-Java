package DSA.Recursion;

import java.util.Scanner;

public class SumOfArray {

    public static Scanner sc = new Scanner(System.in);
    public static int[] takeInput(){
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(sum(takeInput()));
    }
    public static int sum(int input[]) {
        return calculateSum(input, 0);

    }
    public static int calculateSum(int input[],int n){
        if(n==input.length-1){
            return input[n];
        }
        return input[n] + calculateSum(input, n+1);
    }

}
