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
