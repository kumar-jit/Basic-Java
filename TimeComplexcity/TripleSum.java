


package TimeComplexcity;

import java.util.Arrays;
import java.util.Scanner;

public class TripleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        while (repeat>0){

            int arrLength = sc.nextInt();
            int[] arr = new int[arrLength];
            for(int i = 0;i<arrLength;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(tripletSum(arr,sc.nextInt()));
            repeat --;
        }
    }

    public static int tripletSum(int[] arr, int x) {
        //Your code goes here
        Arrays.sort(arr);
        int count = 0;
        for(int i = 0;i<arr.length-3;i++){
            count += findPair(arr,x-arr[i],i+1,arr.length-1);
        }

        return count;
    }

    public static int findPair(int[] arr,int x,int start, int end){
        int count = 0;
        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum<x)
                start++;
            else if (sum>x)
                --end;
            else {
                int currentStartElement = arr[start];
                int currentEndElement = arr[end];
                if(currentEndElement == currentStartElement){
                    int totalitarianism = (end - start) + 1;
                    count = count + (totalitarianism * (totalitarianism - 1) / 2);
                    return count;
                }
                else {
                    int tsi = start + 1;
                    int tei = end - 1;
                    while(tsi<=tei && arr[tsi]==currentStartElement){
                        tsi++;
                    }
                    while (tei>=tsi && arr[tei]== currentEndElement){
                        tei--;
                    }
                    int totalElementFormStart = tsi-start;
                    int totalElementFormEnd = end - tei;


                    count += totalElementFormStart*totalElementFormEnd;
                    start = tsi;
                    end = tei;
                }
            }
        }
        return count;
    }

}
