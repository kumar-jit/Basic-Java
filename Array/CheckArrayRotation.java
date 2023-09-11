/**
 * @link : https://classroom.codingninjas.com/app/classroom/me/24108/content/586727/offering/9098081/problem/30
 * @title : Check Array Rotation
 * @Logic: looking where array value starts increasing. in which point array value will be smaller then previous value that is the value of rotation. return that value
 */

package Array;

import java.util.Scanner;

public class CheckArrayRotation {
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
            System.out.println(CheckRotation(arr));
        }
    }

    public static int CheckRotation(int[] arr){
        for(int i = 1;i<arr.length;i++){

            // checking for in which i'th position array value start decreasing
            if(arr[i-1]>arr[i]){
                // return the position
                return i;
            }
        }
        // if no decreasing point found then return 0, that's means no rotation
        return 0;
    }
}
