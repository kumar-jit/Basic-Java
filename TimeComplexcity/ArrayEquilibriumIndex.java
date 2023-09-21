package TimeComplexcity;

import java.util.Scanner;

public class ArrayEquilibriumIndex {
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

        int repeat = sc.nextInt();
        for(int i = 0;i<repeat;i++){
            System.out.println(arrayEquilibriumIndex(takeInput()));
        }
    }

    public static int arrayEquilibriumIndex(int[] arr){
        //Your code goes here
        if(arr.length==0)
            return -1;

        for(int i = 0; i<arr.length;i++){
            int leftSum = 0,rightSum = 0;
            for(int left = 0;left<i;left++){
                leftSum +=arr[left];
            }
            if(i+1<arr.length){
                for(int right = i+1;right<arr.length;right++){
                    rightSum +=arr[right];
                }
            }

            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }
}
