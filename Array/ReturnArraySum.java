/*
        Return Array Sum
        -------------------------
        Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
        Input Format :
        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

        The first line of each test case or query contains an integer 'N' representing the size of the array/list.

        Second line contains 'N' single space separated integers representing the elements in the array/list.
        Output Format :
        For each test case, print the sum of the numbers in the array/list.

        Output for every test case will be printed in a separate line.

        Constraints :
        1 <= t <= 10^2
        0 <= N <= 10^5

        Time Limit: 1sec

        Sample Input 1:
        1
        3
        9 8 9

        Sample Output 1:
        26

 */

package Array;

import java.util.Arrays;
import java.util.Scanner;
public class ReturnArraySum {
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
            System.out.println(sumArray(arr));
        }
    }
    public static int sumArray(int[] arr){
        int sum =0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
