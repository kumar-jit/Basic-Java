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
