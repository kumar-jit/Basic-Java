

package DSA.Hashmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainFunction {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }

        String[] strNums;
        strNums = br.readLine().split("\\s");

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static String takeInputString() throws IOException {
        String str = br.readLine();
        return str;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
//        _Hashmaps_L16_MaximumFrequencyNumber();
//        _Hashmaps_L16_PrintIntersection();
//        _Hashmaps_L16_LongestConsecutiveSequence();

//        _Hashmaps_L16_ExtractUniqueCharacters();

        _Hashmap_L16_LongestSubArrayZeroSum();

    }

    public static  void _Hashmaps_L16_MaximumFrequencyNumber() throws NumberFormatException, IOException {
        int[] arr = takeInput();
        System.out.println(Hashmaps_L16_MaximumFrequencyNumber.maxFrequencyNumber(arr));
    }

    public static void _Hashmaps_L16_PrintIntersection() throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            Hashmaps_L16_PrintIntersection.intersection(arr1, arr2);
            System.out.println();

            t -= 1;
        }
    }

    public static void _Hashmaps_L16_LongestConsecutiveSequence() throws NumberFormatException, IOException {
        int[] arr = takeInput();
        ArrayList<Integer> ans = Hashmaps_L16_LongestConsecutiveSequence.longestConsecutiveIncreasingSequence(arr);
        printArray(ans);

    }

    public static void _Hashmaps_L16_ExtractUniqueCharacters() throws NumberFormatException, IOException {


        String str = takeInputString();
        System.out.print(Hashmaps_L16_ExtractUniqueCharacters.uniqueChar(str));


    }

    public static void _Hashmap_L16_PairsWithDifferenceK() throws NumberFormatException, IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());
        System.out.println(Hashmap_L16_PairsWithDifferenceK.getPairsWithDifferenceK(arr, k));
    }

    public static void _Hashmap_L16_LongestSubArrayZeroSum() throws NumberFormatException, IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Hashmap_L16_LongestSubArrayZeroSum.lengthOfLongestSubsetWithZeroSum(arr));
    }
}
