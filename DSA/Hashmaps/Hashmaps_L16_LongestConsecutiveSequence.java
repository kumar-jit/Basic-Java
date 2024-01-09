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
