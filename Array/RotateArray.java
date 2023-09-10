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
            RotateArr(arr1,sc.nextInt());
            System.out.println(Arrays.toString(arr1));
        }
    }
    public static void RotateArr(int[] arr, int d){
        if(d==arr.length)
            return;
        for(;d>0;d--){
            int stored = arr[0];
            for(int i = 0;i<arr.length;i++){
                if(i==arr.length-1){
                    arr[0] = stored;
                }
                else{
                    int backup = arr[i+1];
                    arr[i+1] = stored;
                    stored = backup;
                }
            }
        }
    }
}
