package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PushZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int arr1Length = sc.nextInt();
            int[] arr1 = new int[arr1Length];
            for(int j =0;j<arr1Length;j++){
                arr1[j] = sc.nextInt();
            }
            PushZero(arr1);
            System.out.println(Arrays.toString(arr1));
        }
    }
    public static void PushZero(int[] arr){
        int j = -1;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]==0){
                if(j==-1){
                    j=i+1;
                }
                boolean flag = true;
                for(;j<arr.length;j++){
                    if(arr[j]!=0){
                        swap(arr,i,j);
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return;
                }

            }
        }
    }
//    public static void PushZero(int[] arr){
//        int start = 0, end = arr.length-1;
//        while (start<end){
//            if(arr[start]!=0 && arr[end]==0){
//                start ++; end --;
//            } else if (arr[start]!=0 && arr[end]!=0) {
//                start++;
//            }
//            else if(arr[start]==0 && arr[end]==0){
//                end--;
//            }
//            else {
//                swap(arr,start,end);
//                start ++;end--;
//            }
//        }
//    }
//
    public static void swap(int[] arr,int position1,int position2){
        int backup = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = backup;
    }
}
