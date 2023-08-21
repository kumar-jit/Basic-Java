package Basic;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int revNo = 0;
        while (no!=0){
            revNo = revNo*10 + (no%10);
            no = no/10;
        }
        System.out.print(revNo);
    }
}
