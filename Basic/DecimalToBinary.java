package Basic;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        long binary=0;
        long place = 1;
        while(no>0){
            binary = binary + (no%2)*place;
            place = place*10;
            no = no/2;
        }
        System.out.print(binary);
    }
}
