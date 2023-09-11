/**
 * @link : https://classroom.codingninjas.com/app/classroom/me/24108/content/586727/offering/9098081/problem/186
 * @title : Second Largest in array
 */


package Array;

import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(FindSecondLargest(arr,arrLength));
    }

    public static int FindSecondLargest(int[] arr,int n){
        int largest = arr[0],secondLargest = Integer.MIN_VALUE;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<largest){
                if(arr[i]>secondLargest){
                    secondLargest = arr[i];
                }
            }
            else if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }
}
