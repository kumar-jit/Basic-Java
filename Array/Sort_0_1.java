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

    public static void sort01(int[] arr){
        int count0=0,count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
                continue;
            }
            if(arr[i]==1){
                count1++;
                continue;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(count0>0){
                arr[i]=0;
                --count0;
                continue;
            }
            if (count0==0 && count1>0){
                arr[i]=1;
                --count1;
            }
        }
    }
}
