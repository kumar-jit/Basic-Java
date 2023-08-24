package Basic;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
//        long binary=0;
//        while(no>0){
//            binary = binary*10 + (no%2);
//            no = no/2;
//        }
        System.out.print(binary(no));
    }
    static int binary(int no){
        if(no/2!=1){
            binary(no/2);
        }
        return binary(no%2);
    }
}
