package DSA.Recursion;

import java.util.Scanner;

public class FirstIndexOfANumberInArray {
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
        System.out.println(firstIndex(takeInput(), sc.nextInt()));
    }
    public static int firstIndex(int input[], int x) {
        return findFirstIndex(input,x,0);
    }
    public static int findFirstIndex(int[] arr, int x,int i){
        if(i>=arr.length)
            return -1;
        if(arr[i]==x)
            return i;
        return findFirstIndex(arr,x,i+1);
    }
}
