package Basic;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int decimal=0,multi=1;
        while (no!=0){
            decimal = decimal + (no%10)*multi;
            multi = multi*2;
            no=no/10;
        }
        System.out.print(decimal);

    }
}
