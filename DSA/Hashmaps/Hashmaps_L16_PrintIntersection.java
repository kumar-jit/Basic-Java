/*
     Array Intersection
    You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

    Note :
    Input arrays/lists can contain duplicate elements.

    The intersection elements printed would be in ascending order.


    Detailed explanation ( Input/output format, Notes, Images )
    Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^4
    0 <= M <= 10^4

    Time Limit: 1 sec
    Sample Input 1 :
    2
    6
    2 6 8 5 4 3
    4
    2 3 4 7
    2
    10 10
    1
    10
    Sample Output 1 :
    2 3 4
    10
    Sample Input 2 :
    1
    4
    2 6 1 2
    5
    1 2 3 4 2
    Sample Output 2 :
    1 2 2
    Explanation for Sample Output 2 :
    Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.
 */

package DSA.Hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Hashmaps_L16_PrintIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        HashMap<Integer,Integer> freqStore = new HashMap<>();

        for (int j : arr1) {
            freqStore.put(j, freqStore.getOrDefault(j, 0) + 1);
        }
        Arrays.sort(arr2);
        for (int j : arr2) {
            if (freqStore.containsKey(j) && freqStore.get(j) > 0) {
                System.out.print(j + " ");
                freqStore.put(j, freqStore.get(j) - 1);
            }
        }
    }
}
