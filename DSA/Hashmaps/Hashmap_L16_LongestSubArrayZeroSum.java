/*
    Longest subarray zero sum
    Given an array consisting of positive and negative integers, find the length of the longest subarray whose sum is zero.

    Detailed explanation ( Input/output format, Notes, Images )
    Constraints:
    0 <= N <= 10^8
    Time Limit: 1 sec
    Sample Input 1:
    10
     95 -97 -387 -435 -5 -70 897 127 23 284
    Sample Output 1:
    5
    Explanation:
    The five elements that form the longest subarray that sum up to zero are: -387, -435, -5, -70, 897
    Note
    You don't have to print anything. Just complete the definition of the function given and return the value accordingly.
 */

package DSA.Hashmaps;

import java.util.HashMap;

public class Hashmap_L16_LongestSubArrayZeroSum {
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        // Write your code here
        HashMap<Integer,Integer> storeSum = new HashMap<>();

        int sum = 0, length = 0;
        for(int i = 0; i<arr.length;i++){
            sum += arr[i];

            if(sum == 0 && length < i+1){
                length = i+1;
            }
            else if(storeSum.containsKey(sum)){
                int tempLength = i - storeSum.get(sum);
                if(length < tempLength ){
                    length = tempLength;
                }
            }
            else{
                storeSum.put(sum,i);
            }
        }
        return  length;
    }
}
