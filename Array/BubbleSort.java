package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        BubbleSortArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void BubbleSortArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            int swap = 0;
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                }
            }
            if(swap==0)
                return;
        }
    }


}
