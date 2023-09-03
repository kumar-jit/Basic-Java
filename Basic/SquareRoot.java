package Basic;

import java.util.Scanner;
import java.lang.Math;

//**********************Not recommended solution*****************************
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        int count = 0;
        while(count<=no/2+1){
            if(count*count == no){
                System.out.print(count);
                return;
            }
            if (count*count>no){
                if(Math.abs( no- count*count) >= Math.abs( no- (count-1)*(count-1))) System.out.println(count-1);
                else System.out.println(count);
                return;
            }
            count ++;
        }
        System.out.print(count-1);
    }
}
