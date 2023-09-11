package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for(int i=0;i<repeat;i++){
            int arrayLength = sc.nextInt();
            int arr[] = new int[arrayLength];
            for(int j =0;j<arrayLength;j++){
                int value = sc.nextInt();
                arr[j] = value;
            }
            Sort_0_1_2(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

//    Using Swap technique --------
    // first move all the 2 left  then swap 1 , 0

    public static void Sort_0_1_2(int[] arr){
        int start = 0,end = arr.length-1;
        while(start<end){
            if(arr[start]!=2 && arr[end]!=2)
                start++;
            else if (arr[start]!=2 && arr[end]==2) {
                end--;
            }
            else if(arr[start]==2 && arr[end]!=2){
                swap(arr,start,end);
                start++;end--;
            } else{
                end--;
            }

        }
        start = 0;
        while (start<end){
            if((arr[start]==0 && arr[end]==0) || (arr[start]==0 && arr[end]!=0))
                start++;
            else if (arr[start]!=0 && arr[end]==0) {
                swap(arr,start,end);
                start++;end--;
            }
            else{
                end--;
            }
        }
    }
    public static void swap(int[] arr,int position1,int position2){
        int backup = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = backup;
    }
    //   using count technique ----------
    // count no of 0,1,2 then re-create the array with 0,1,2
//    public static void Sort_0_1_2(int[] arr){
//        int n1 = 0,n2 = 0,n3 = 0,i,j;
//        for(i = 0;i < arr.length;i++) {
//            if(arr[i] == 0)
//                n1++;
//            if(arr[i] == 1)
//                n2++;
//            if(arr[i] == 2)
//                n3++;
//        }
//        i = 0;
//        j = 0;
//        while(j < n1) {
//            arr[i] = 0;
//            i++;
//            j++;
//        }
//        j = 0;
//        while(j < n2) {
//            arr[i] = 1;
//            i++;
//            j++;
//        }
//        j = 0;
//        while(j < n3) {
//            arr[i] = 2;
//            i++;
//            j++;
//        }
//    }
}
