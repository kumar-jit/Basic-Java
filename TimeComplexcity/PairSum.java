package TimeComplexcity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        while (repeat>0){

            int arrLength = sc.nextInt();
            int[] arr = new int[arrLength];
            for(int i = 0;i<arrLength;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(findPair(arr,sc.nextInt()));
            repeat --;
        }
    }
//    public static int findPair(int[] arr,int x){
//        int count= 0;
//        for(int i = 0; i<arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==x){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
    public static int findPair(int[] arr,int x){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0, end = arr.length-1,count = 0;
        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum<x)
                start++;
            else if (sum>x)
                --end;
            else {
                // storing current START and END element to check Duplicate
                int currentStartElement = arr[start];
                int currentEndElement = arr[end];

                // checking for edge case like 2 2 2 2 2, k = 4 where start and end is same
                // if start and end is same then total count of pair will be nC2
                if(currentEndElement == currentStartElement){
                    int totalitarianism = (end - start) + 1;
                    // calculating nc2 rule || NC2 = N! / (2! * (N-2)!) = N*(N-1)/2
                    count = count + (totalitarianism * (totalitarianism - 1) / 2);
                    return count;
                }

                // checking edge case like 3,3,6,6,6  k = 9
                else {

                    int tsi = start + 1;
                    int tei = end - 1;

                    // counting total duplicate of currentStartElement
                    while(tsi<=tei && arr[tsi]==currentStartElement){
                        tsi++;
                    }
                    // counting total duplicate of currentEndElement
                    while (tei>=tsi && arr[tei]== currentEndElement){
                        tei--;
                    }
                    int totalElementFormStart = tsi-start;  // total of currentStartElement
                    int totalElementFormEnd = end - tei;    // currentEndElement
                    // if X no of currentStartElement and Y no of currentEndElement then total count will be X*Y
                    count += totalElementFormStart*totalElementFormEnd;

                    // updating the end and current position for further checking
                    start = tsi;
                    end = tei;
                }
            }
        }
        return count;
    }
}
