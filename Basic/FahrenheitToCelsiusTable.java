package Basic;
import java.util.Scanner;
import java.lang.Math;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int gap = sc.nextInt();

        while(start<=end){
            System.out.println(Integer.toString(start)+" "+Integer.toString((int)((start - 32.0)*(5.0/9.0))));
            start += gap;
        }
    }
}
