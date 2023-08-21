package Basic;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        while (count<=n){
            if(count%2==0) System.out.print(Integer.toString(count)+" ");
            count +=1;
        }
    }
}
