package Basic;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int count = 1;
        boolean flag = true;
        while ((count= count+1)<= (no/2)){
            if(no%count==0){
                System.out.print(count+" ");
                flag = false;
            }
        }
        if(flag) System.out.print(-1);
    }
}
