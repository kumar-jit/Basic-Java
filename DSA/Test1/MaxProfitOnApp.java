package DSA.Test1;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class MaxProfitOnApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumProfit(arr));

    }

    public static int maximumProfit(int arr[]) {
        Arrays.sort(arr);
        int maxProfit = 0;
        for(int i = 0;i<arr.length;i++){
            maxProfit = Math.max((arr.length-i)*arr[i],maxProfit);
        }
        return maxProfit;
    }
}
