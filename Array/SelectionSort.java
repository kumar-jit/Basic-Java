package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        SelectionSortArr(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void SelectionSortArr(int[] arr){
        for(int i =0;i<arr.length;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            int swap = arr[min];
            arr[min] = arr[i];
            arr[i] = swap;
        }
    }
}
