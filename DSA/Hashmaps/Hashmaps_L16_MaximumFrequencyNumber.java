/*
     Maximum Frequency Number

    You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.

    If two or more elements are having the maximum frequency, return the element which occurs in the array first.

    Detailed explanation ( Input/output format, Notes, Images )
    Constraints:
    0 <= N <= 10^8
    Time Limit: 1 sec
    Sample Input 1 :
    13
    2 12 2 11 12 2 1 2 2 11 12 2 6
    Sample Output 1 :
    2
    Sample Input 2 :
    6
    7 2 2 4 8 4
    Sample Output 2 :
    2
    Explanation:
    Here, both element '2' and element '4' have same frequency but '2' ocurr first in orignal array that's why we are returning '2' as output.
 */

package DSA.Hashmaps;

import java.util.HashMap;

public class Hashmaps_L16_MaximumFrequencyNumber {
    public static int maxFrequencyNumber(int[] arr){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer,Integer> freqStore = new HashMap<>();
        int maxFreq = -1;
        for (int k : arr) {
            freqStore.put(k, freqStore.getOrDefault(k, 0) + 1);
        }
        for (int j : arr) {
            if (maxFreq == -1) {
                maxFreq = j;
            }
            if (freqStore.get(j) > freqStore.get(maxFreq)) {
                maxFreq = j;
            }
        }
        return maxFreq;
    }
}
