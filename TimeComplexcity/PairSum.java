package TimeComplexcity;

import java.util.Arrays;
import java.util.Scanner;

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
//                ++count;
//                ++start;
//                --end;
            }
        }
        return count;
    }
}
