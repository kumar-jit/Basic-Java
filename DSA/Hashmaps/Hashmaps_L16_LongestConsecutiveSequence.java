/*
    Longest Consecutive Sequence
    You are given an array of unique integers that contain numbers in random order. You have to find the longest possible sequence of consecutive numbers using the numbers from given array.

    You need to return the output array which contains starting and ending element. If the length of the longest possible sequence is one, then the output array must contain only single element.

    Note:
    1. Best solution takes O(n) time.
    2. If two sequences are of equal length, then return the sequence starting with the number whose occurrence is earlier in the array.
    Detailed explanation ( Input/output format, Notes, Images )
    Constraints :
    0 <= n <= 10^6
    Time Limit: 1 sec
    Sample Input 1 :
    13
    2 12 9 16 10 5 3 20 25 11 1 8 6
    Sample Output 1 :
    8 12
    Explanation:The longest consecutive sequence here is [8, 9, 10, 11, 12]. So the output is the start and end of this sequence: [8, 12].
    Sample Input 2 :
    7
    3 7 2 1 9 8 41
    Sample Output 2 :
    7 9
    Explanation:There are two sequences of equal length here: [1,2,3] and [7,8,9]. But since [7,8,9] appears first in the array (7 comes before 1), we return this sequence. So the output is [7,9].
    Sample Input 3 :
    7
    15 24 23 12 19 11 16
    Sample Output 3 :
    15 16
    Explanation:The longest consecutive sequence here is [15,16]. So the output is [15,16].
 */

package DSA.Hashmaps;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class Hashmaps_L16_LongestConsecutiveSequence {
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        HashMap<Integer,Boolean> freqStore = new HashMap<>();
        HashMap<Integer,Integer> indexStore = new HashMap<>();


        for(int i =0;i<arr.length;i++){
            freqStore.put(arr[i], true);
            indexStore.put(arr[i],i );
        }

        int maxLength = 0,min=0,max=0;

        for(int i : arr){
            if(freqStore.get(i)){
                int findMax = i;
                int findMin = i;

                while(freqStore.containsKey(findMax+1)){
                    freqStore.put(findMax+1, false);
                    findMax++;
                }

                while(freqStore.containsKey(findMin-1)){
                    freqStore.put(findMin, false);
                    findMin--;
                }

                if((findMax - findMin +1) > maxLength){
                    maxLength = (findMax - findMin) +1;
                    min = findMin;
                    max = findMax;
                }

                if((findMax - findMin +1) == maxLength && indexStore.get(min) > indexStore.get(findMin)){
                    min = findMin;
                    max = findMax;
                }
                freqStore.put(i, false);

            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
