package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int arr1Length = sc.nextInt();
            int[] arr1 = new int[arr1Length];
            for(int j =0;j<arr1Length;j++){
                arr1[j] = sc.nextInt();
            }
            LeftRotation(arr1,sc.nextInt());
            System.out.println(Arrays.toString(arr1));
        }
    }
    public static void LeftRotation(int[] arr, int d){
        int l = arr.length;
        if(l%2==0){
            oddLength(arr,l,arr[0],0,d);
            oddLength(arr,l,arr[1],1,d);
        }
    }

    public static void oddLength(int[] arr,int l,int value,int position,int d){
        value = arr[0];
        position = 0;
        for(int count = 0;count<l/2;count++){
            if(position-d<0){
                int nextP = l - d + position;
                int backup = arr[nextP];
                arr[nextP] = value;
                value = backup;
                position = nextP;
            }
            else {
                int nextP = position - d;
                int backup = arr[nextP];
                arr[nextP] = value;
                value = backup;
                position = nextP;
            }
        }
    }
}
