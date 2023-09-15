/**
 * @link : https://classroom.codingninjas.com/app/classroom/me/24108/content/586730/offering/9098101/problem/702
 * @title : Maximise the Sum
 */

package Array;

import java.util.Scanner;

public class MaximiseTheSum {
    public static Scanner sc = new Scanner(System.in);
    public static int[] takeInput(){
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(maximumSumPath(takeInput(),takeInput()));
    }

    public static long maximumSumPath(int[] input1, int[] input2) {

        long totalSum = 0,sum1=0,sum2=0;
        int p1=0,p2=0;

        while (p1<input1.length && p2<input2.length){
            if(input1[p1]<input2[p2]){
                sum1 += input1[p1++];
            }
            else if (input1[p1]>input2[p2]){
                sum2 += input2[p2++];
            }
            else {
                sum1 += input1[p1++];
                sum2 += input2[p2++];

                totalSum += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
            }
        }

        while (p1<input1.length){
            sum1 += input1[p1++];
        }
        while (p2<input2.length){
            sum2 += input2[p2++];
        }

        totalSum += Math.max(sum1,sum2);
        return totalSum;
    }

}
