package DSA.Recursion;

import java.util.Scanner;

public class PrintLastNNaturalNumbers {
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
        System.out.println(lastIndex(takeInput(), sc.nextInt()));
    }
    public static int lastIndex(int input[], int x) {
        return findLastIndex(input,x,0,-1);
    }
    public static int findLastIndex(int[] arr, int x,int i,int index){
        if(i>=arr.length)
            return index;
        if(arr[i]==x)
            index =  i;
        return findLastIndex(arr,x,i+1,index);
    }
}
