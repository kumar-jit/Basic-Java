package Basic;

import java.util.Scanner;

public class AllPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt(),count=2;
        while(count<=no){
            if(!PrimeCheck(count)) System.out.println(count);
            count++;
        }
    }

    static boolean PrimeCheck(int no){
        int count = 2;
        while(count<=no/2){
            if(no%count == 0) return true;
            count++;
        }
        return false;
    }
}
