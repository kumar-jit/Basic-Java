package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for(int i = 0;i<arrLength;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(fBinarySearch(arr,sc.nextInt()));
        List<int[]> listOfIntArray = new ArrayList<>();
        System.out.println(Collections.unmodifiableList(listOfIntArray));

    }

    public static int fBinarySearch(int[] nums,int target){
        int start = 0,end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target){
                end = mid-1;
            }
            if (nums[mid]<target) {
                start = mid+1;
            }

        }
        return -1;
    }
}
