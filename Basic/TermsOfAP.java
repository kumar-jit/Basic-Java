package Basic;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int no = sc.nextInt();
        for(int i = 1;no>0;i++){
            int cal = 3*i +2;
            if(cal%4!=0){
                System.out.print(cal+" ");
                no--;
            }
        }
    }
}
