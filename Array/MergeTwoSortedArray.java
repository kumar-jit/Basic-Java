package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int arr1Length = sc.nextInt();
            int[] arr1 = new int[arr1Length];
            for(int j =0;j<arr1Length;j++){
                arr1[j] = sc.nextInt();
            }
            int arr2Length = sc.nextInt();
            int[] arr2 = new int[arr2Length];
            for(int j =0;j<arr2Length;j++){
                arr2[j] = sc.nextInt();
            }
            System.out.println(Arrays.toString(MergeArray(arr1, arr2)));
        }
    }

    public static int[] MergeArray(int[] arr1,int[] arr2){
        int[]  mergedArr = new int[(arr1.length + arr2.length)];
        int i = 0,p1=0,p2=0;
        while (i<mergedArr.length && p1<arr1.length && p2<arr2.length){
            if(arr1[p1]==arr2[p2]){
                mergedArr[i++] = arr1[p1++];
                mergedArr[i++] = arr2[p2++];
            }
            else if(arr1[p1]<arr2[p2]){
                mergedArr[i++] = arr1[p1++];
            }
            else {
                mergedArr[i++] = arr2[p2++];
            }
        }
        while (p1<arr1.length && i<mergedArr.length){
            mergedArr[i++] = arr1[p1++];
        }
        while (p2<arr2.length && i<mergedArr.length){
            mergedArr[i++] = arr2[p2++];
        }
        return mergedArr;
    }
}