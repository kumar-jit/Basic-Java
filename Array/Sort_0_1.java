package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        while (repeat>0){

            int arrLength = sc.nextInt();
            int[] arr = new int[arrLength];
            for(int i = 0;i<arrLength;i++){
                arr[i] = sc.nextInt();
            }
            sort01(arr);
            System.out.println(Arrays.toString(arr));
            repeat --;
        }
    }

//    public static void sort01(int[] arr){
//        int count0=0,count1=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                count0++;
//                continue;
//            }
//            if(arr[i]==1){
//                count1++;
//                continue;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(count0>0){
//                arr[i]=0;
//                --count0;
//                continue;
//            }
//            if (count0==0 && count1>0){
//                arr[i]=1;
//                --count1;
//            }
//        }
//    }

    public static void sort01(int[] arr){
        int left = 0,right= arr.length-1;

        // --- best approach ------------
        while (left<=right){
            if(left==0 && right==0){
                left++;
            }
            else if (left==0 && right==1){
                left++;right--;
            }
            else if(left==1 && right ==1){
                right--;
            }else {
                swap(arr,left,right);
                left++;right--;
            }
        }

// ---------- take more time to execute -------------
//        while (left<=right){
//            if(arr[left]==0){
//                left++;
//            }
//            else {
//                swap(arr,left,right);
//                right--;
//            }
//        }
    }

    public static void swap(int[] arr,int position1,int position2){
        int backup = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = backup;
    }
}
