package TimeComplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {

        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i++) {
            int[] arr = takeInput();
            rotate(arr, sc.nextInt());
            System.out.println(Arrays.toString(arr));
        }
    }

//    public static void rotate(int[] arr, int d) {
//        //Your code goes here
//        int[] storeArr = new int[d];
//        for (int i = 0; i<d;i++){
//            storeArr[i] = arr[i];
//        }
//
//        for(int i = 0;i<arr.length-d;i++){
//            arr[i] = arr[i+d];
//        }
//        for(int i = 0;i<storeArr.length;i++){
//            arr[arr.length-d+i] = storeArr[i];
//        }
//    }

        public static void rotate(int[] arr, int d) {
        //Your code goes here
            reverseArray(arr,0,arr.length);
            reverseArray(arr,0,arr.length-d);
            reverseArray(arr,arr.length-d,arr.length);

        }

        public static void reverseArray(int[] arr,int start,int end){
            for (int i = start;i<(start+end)/2;i++){
                int temp = arr[end-i-1+start];
                arr[end-i-1+start] = arr[i];
                arr[i] = temp;
            }
        }

}
