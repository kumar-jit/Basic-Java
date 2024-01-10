
/*
    Pairs with difference K
    You are given with an array of integers and an integer K. You have to find and print the count of all such pairs which have difference K.

    Note: Take absolute difference between the elements of the array.

    Detailed explanation ( Input/output format, Notes, Images )
    Constraints :
    0 <= n <= 10^4
    Time Limit: 1 sec
    Sample Input 1 :
    4
    5 1 2 4
    3
    Sample Output 1 :
    2
    Explanation
    (5,2) and (1,4) are the possible combinations as their absolute difference is 3.
    Sample Input 2 :
    4
    4 4 4 4
    0
    Sample Output 2 :
    6
 */
package DSA.Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_L16_PairsWithDifferenceK {
    public static int getPairsWithDifferenceK(int input[], int k) {
        //Write your code here

        HashMap<Integer,Integer> elementStore = new HashMap<>();
        for (int i : input){
            elementStore.put(i, elementStore.getOrDefault(i,0)+1);
        }
        int count = 0;
        Set<Integer> keyList  = elementStore.keySet();
        for(int i : keyList){
            if(k==0 && elementStore.get(i)>1){
                int n = elementStore.get(i);
                count += n*(n-1)/2;
            }
            else{
                if(elementStore.containsKey(i-k) ){
                    count += elementStore.get(i) * elementStore.get(i-k);
                }
            }
        }


        return count ;
    }
}
