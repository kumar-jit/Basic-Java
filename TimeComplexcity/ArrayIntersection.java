package TimeComplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {
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
            intersection(takeInput(),takeInput());
        }
    }
    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        Arrays.sort(arr1);
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = -1;
                    break;
                }
            }
        }
        System.out.println();
    }
}
