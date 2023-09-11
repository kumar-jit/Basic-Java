/**
 * @link : https://classroom.codingninjas.com/app/classroom/me/24108/content/586727/offering/9098081/problem/22
 * @title : Sum of Two Arrays
 */


package Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {
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

        int repeat = sc.nextInt();
        for(int i = 0;i<repeat;i++){
            int[] arr1 = takeInput(),arr2 = takeInput();
            int[] arr3 = new int[Math.max(arr1.length,arr2.length)+1];
            sumOfArray(arr1,arr2,arr3);
            System.out.println(Arrays.toString(arr3));
        }
    }

    public static void sumOfArray(int[] arr1,int[] arr2,int[] arr3){
        int carry = 0;
        int length1 = arr1.length-1,length2 = arr2.length-1;
        for(int i = arr3.length-1;i>=0;i--){

            int sum = 0;
            if(length1>=0 && length2>=0){
                sum = arr1[length1] + arr2[length2] + carry;
                arr3[i] = sum%10;
                carry = sum/10;
                length1--;
                length2--;
            }
            else if(length1>=0){
                sum = arr1[length1] + carry;
                arr3[i] = sum%10;
                carry = sum/10;
                length1--;
            }
            else if(length2>=0){
                sum = arr2[length2] + carry;
                arr3[i] = sum%10;
                carry = sum/10;
                length2--;
            }
            else {
                arr3[i] = carry;
            }
        }
    }
}
