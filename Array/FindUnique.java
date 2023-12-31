/*      Find Unique
        ---------
        You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
        Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
        You need to find and return that number which is unique in the array/list.

        Note:
        Unique element is always present in the array/list according to the given condition.

        Input format :
        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
        First line of each test case or query contains an integer 'N' representing the size of the array/list.
        Second line contains 'N' single space separated integers representing the elements in the array/list.

        Output Format :
        For each test case, print the unique element present in the array.
        Output for every test case will be printed in a separate line.

        Constraints :
        1 <= t <= 10^2
        0 <= N <= 10^3

        Time Limit: 1 sec

        Sample Input 1:
        1
        7
        2 3 1 6 3 6 2

        Sample Output 1:
        1

        Sample Input 2:
        2
        5
        2 4 7 2 7
        9
        1 3 1 3 6 6 7 10 7

        Sample Output 2:
        4
        10

 */

package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        while (repeat>0){
            int arrLength = sc.nextInt();
            int[] arr = new int[arrLength];
            for(int i = 0;i<arrLength;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(FindUniqueNo(arr));
            repeat --;
        }
    }
//    public static int FindUniqueNo(int[] arr){
//        boolean status = false;
//        int no = 0;
//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j< arr.length;j++){
//                if (i != j && arr[i] == arr[j]) {
//                    status = true;
//                    break;
//                }
//            }
//            if(status){
//                status = false;
//                continue;
//            }
//            no = arr[i];
//        }
//        return no;
//    }

// ------------------  Using HasMap ---------------------------
    public static int FindUniqueNo(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        boolean status = false;
        int no = 0;
        for(int i=0;i< arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Integer e : map.keySet()){
            if(map.get(e)==1)
                return e;
        }
        return no;
    }
}
