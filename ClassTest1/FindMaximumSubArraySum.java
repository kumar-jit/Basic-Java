package ClassTest1;
import java.util.Scanner;
public class FindMaximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(calculateSumSub(arr, x));
    }

    public static int calculateSumSub(int[] arr, int x) {
        int max = 0,s = 0,sum = 0;
        for (int i = 0; i <arr.length; i++) {
            sum += arr[i];
            if(s == i-x+1){
                if(sum>max)
                    max = sum;
                sum -= arr[s];
                s++;
            }

        }
        return max;
    }
}
