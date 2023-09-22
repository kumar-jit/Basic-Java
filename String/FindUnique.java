package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        while (repeat>0){
            int arrLength = sc.nextInt();
            int[] arr = new int[arrLength];
            for(int i = 0;i<arrLength;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(FindUniqueNo(arr));
            repeat --;
        }
    }
    public static int FindUniqueNo(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        boolean status = false;
        int no = 0;
        for(int i=0;i< arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Integer e : map.keySet()){
            if(map.get(e)==1)
                return e;
        }
        return no;
    }
}
