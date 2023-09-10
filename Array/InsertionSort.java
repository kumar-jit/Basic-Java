package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        InsertionSortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertionSortArr(int[] arr){
        for(int i=1;i<arr.length;i++){
//---------------- Using While loop -----------
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }

//---------------- Using for loop----------------
//            for(int j =i;j>=1;j--){
//                if(arr[j]<arr[j-1])
//                    swap(arr,j,j-1);
//                else break;
//            }
        }
    }

    public static void swap(int[] arr,int position1,int position2){
        int backup = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = backup;
    }
}
