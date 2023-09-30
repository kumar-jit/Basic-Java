package DSA.Recursion;

import java.util.Scanner;

public class CheckNumberInArray {
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
        System.out.println(checkNumber(takeInput(), sc.nextInt()));
    }
    public static boolean checkNumber(int input[], int x) {
        return findElement(input,x,0);
    }

    public static boolean findElement(int[] arr, int x,int i){
        if(i>=arr.length)
            return false;
        if(arr[i]==x)
            return true;

        return findElement(arr,x,i+1);
    }
}

